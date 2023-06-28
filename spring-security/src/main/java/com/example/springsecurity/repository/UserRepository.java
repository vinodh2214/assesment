package com.example.springsecurity.repository;

import com.example.springsecurity.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.username=:username ")
    public User getUserByUsername(@Param("username")String username);
}
