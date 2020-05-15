package com.nostratech.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nostratech.test.demo.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
