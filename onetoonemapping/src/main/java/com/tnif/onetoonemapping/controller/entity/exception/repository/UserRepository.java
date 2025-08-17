package com.tnif.onetoonemapping.controller.entity.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnif.onetoonemapping.controller.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}