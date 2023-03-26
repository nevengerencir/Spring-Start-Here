package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repos.CommentRepository;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("Comment service created -  eager instantiation");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
