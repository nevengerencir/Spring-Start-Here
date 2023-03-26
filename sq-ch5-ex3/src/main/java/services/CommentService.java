package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component
public class CommentService {
    public CommentService(){
        System.out.println("Comment service created -  eager instantiation");
    }
}
