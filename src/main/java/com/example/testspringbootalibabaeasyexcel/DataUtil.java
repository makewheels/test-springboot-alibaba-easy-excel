package com.example.testspringbootalibabaeasyexcel;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class DataUtil {

    public static List<User> getData() {
        List<User> userList = new ArrayList<>();
        File file = new File("C:\\Users\\thedoflin\\Downloads\\201012-bare_teeth-3.png");
        User user1 = new User("user name one" + UUID.randomUUID().toString(),
                new Date(), 312312.421, file);
        User user2 = new User("user name two" + UUID.randomUUID().toString(),
                new Date(), 22212.421, file);
        User user3 = new User("user name three" + UUID.randomUUID().toString(),
                new Date(), 333312.421, file);
        User user4 = new User("user name four" + UUID.randomUUID().toString(),
                new Date(), 444412.421, file);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return userList;
    }
}
