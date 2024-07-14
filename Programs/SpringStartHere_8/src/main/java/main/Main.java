package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var cs1 = c.getBean("commentService", CommentService.class);
        var cs2 = c.getBean("commentService", CommentService.class);
        var s2 = c.getBean(UserService.class);
        boolean b1 = cs1 == cs2;
        boolean b2 = cs1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b1 + " " + b2);
    }
}