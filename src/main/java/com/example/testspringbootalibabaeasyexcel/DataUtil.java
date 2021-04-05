package com.example.testspringbootalibabaeasyexcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataUtil {

    public static List<User> getData() {
        List<User> userList = new ArrayList<>();
        User user1 = new User("user name one", new Date(), 312312.421, "ignore field");
        User user2 = new User("user name two", new Date(), 22212.421, "ignore field");
        User user3 = new User("user name three", new Date(), 333312.421, "ignore field");
        User user4 = new User("user name four", new Date(), 444412.421, "ignore field");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return userList;
    }
}
