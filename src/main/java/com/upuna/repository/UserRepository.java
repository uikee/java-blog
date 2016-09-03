package com.upuna.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.upuna.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
