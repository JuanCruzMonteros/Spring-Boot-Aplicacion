package com.jc.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jc.project.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

 }
