package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void add(User user);

    void update(User user);

    void removeById(Long id);

    List<User> findAll();

    Optional<User> findById(Long id);

    void updateUserFields(User oldUser, User updateUser);

}
