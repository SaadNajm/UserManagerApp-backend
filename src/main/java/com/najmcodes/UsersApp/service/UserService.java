package com.najmcodes.UsersApp.service;

import com.najmcodes.UsersApp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User createUser(User user);
    public List<User>getUsers();

    public User getUserById(long id);

    public void deleteUser(long id);

    public User updateUser(User user,long id);


}
