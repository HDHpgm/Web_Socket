package com.example.websocket.storage;

import java.util.HashSet;
import java.util.Set;

public class UserStorage {

    private static UserStorage instance;
    private Set<String> users;

    private UserStorage() {
        users = new HashSet<>();
    }
    public static synchronized UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }


}
