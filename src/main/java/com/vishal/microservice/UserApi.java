package com.vishal.microservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vishal.microservice.beans.User;

@RestController
public class UserApi {

  @GetMapping("/users")
  public List<User> getAllUsers() {
    User user = new User("Vishal Tambe", "11279695", "Pune");
    List<User> users = new ArrayList<>();
    users.add(user);
    return users;
  }

  @GetMapping("/user")
  public EntityModel<User> getUser() {
    User user = new User("Vishal Tambe", "11279696", "Pune");
    EntityModel<User> userEntity = EntityModel.of(user);
    WebMvcLinkBuilder linkToUsers =
        WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllUsers());
    userEntity.add(linkToUsers.withRel("all-users"));
    return userEntity;
  }
}
