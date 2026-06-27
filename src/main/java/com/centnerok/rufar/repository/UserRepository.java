package com.centnerok.rufar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centnerok.rufar.model.entity.Product;
import com.centnerok.rufar.model.entity.User;

public interface UserRepository  extends JpaRepository<Product, Long> {
    List<User> findByEmail(String email);

    boolean existByEmail(String email);
}
