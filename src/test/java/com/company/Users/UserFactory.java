package com.company.Users;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {


   public static User   getValidUser() {
       ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
     return   new User(resourceBundle.getString("login"),
               resourceBundle.getString("password"),
               resourceBundle.getString("email"));
   }

    public static List<User> getValidUsersList(int count) {
     return    Stream.generate(UserFactory::getValidUser).limit(count).collect(Collectors.toList());
    }
}
