package com.javarush.task.task36.MVC.model.service;

import com.javarush.task.task36.MVC.bean.User;

import java.util.List;

public interface UserService {
    User deleteUser(long id);

    User createOrUpdateUser(String name, long id, int level);

    List<User> getUsersByName(String name);

    List<User> getAllDeletedUsers();

    List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User> filterOnlyActiveUsers(List<User> allUsers);

    User getUsersById(long userId);
}