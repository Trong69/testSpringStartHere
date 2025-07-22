package com.example.proxy;

import com.example.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending Email notification for comment: " + comment.getText());
  }
}
