package com.health.check.helper;

import com.health.check.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserDataHelper {
    private static Integer nextId;
    private static Map<Integer, User> userMap = null;

    public static User saveUser(String name) {
        if (userMap == null) {
            userMap = new HashMap<Integer, User>();
            nextId = 0;
        }
        User user = new User(nextId, name);
        userMap.put(nextId, user);
        nextId++;
        return user;
    }

    public static Collection<User> getUsers() {
        return userMap.values();
    }

    static {
        saveUser("HP");
        saveUser("DELL");
    }
}
