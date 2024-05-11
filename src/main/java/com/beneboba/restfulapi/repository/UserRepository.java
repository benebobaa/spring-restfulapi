package com.beneboba.restfulapi.repository;

import com.beneboba.restfulapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
