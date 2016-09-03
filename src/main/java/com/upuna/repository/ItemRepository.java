package com.upuna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upuna.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}
