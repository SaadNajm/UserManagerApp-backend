package com.najmcodes.UsersApp.repository;

import com.najmcodes.UsersApp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
