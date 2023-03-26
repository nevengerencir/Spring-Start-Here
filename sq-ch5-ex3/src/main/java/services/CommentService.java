package services;

import org.springframework.stereotype.Component;

@Component
public class CommentService {
    public CommentService(){
        System.out.println("Comment service created -  eager instantiation");
    }
}
