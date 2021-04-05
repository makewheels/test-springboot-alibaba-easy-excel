package com.example.testspringbootalibabaeasyexcel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class DataUtil {

    public static List<User> getData() {
        List<User> userList = new ArrayList<>();
        User user1 = new User("user name one" + UUID.randomUUID().toString(), new Date(), 312312.421, "ignore field");
        User user2 = new User("user name two" + UUID.randomUUID().toString(), new Date(), 22212.421, "ignore field");
        User user3 = new User("user name three" + UUID.randomUUID().toString(), new Date(), 333312.421, "ignore field");
        User user4 = new User("user name four" + UUID.randomUUID().toString(), new Date(), 444412.421, "ignore field");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return userList;
    }
}
