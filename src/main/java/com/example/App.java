package com.example;

import com.example.model.Comment;
import com.example.proxy.EmailCommentNotificationProxy;
import com.example.repository.DbCommentRepository;
import com.example.service.CommentService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//      var commentService = context.getBean(CommentService.class);
//      var comment = new Comment();
//      comment.setText("for the spring");
    }
}
