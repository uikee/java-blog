package com.upuna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upuna.entity.Blog;


public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
