package com.example.service;

import com.example.model.Comment;
import com.example.proxy.CommentNotificationProxy;
import com.example.repository.CommentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Data
//@AllArgsConstructor
@Service
public class CommentService {

  public CommentService(){
    System.out.println("CommentService instance created");
  }

//  public void publishComment(Comment comment){
//    commentRepository.storeComment(comment);
//    commentNotificationProxy.sendComment(comment);
//  }
}
