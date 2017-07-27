package ua.com.nmobile.service;


import ua.com.nmobile.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findOne(int id);
    List<User> findAll();
    void delete(User user);
    void delete(int id);
    User findByName(String username);
}
