package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public CommentService() {
        System.out.println("CommentService created.");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
