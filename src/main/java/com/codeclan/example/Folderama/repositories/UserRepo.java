package com.codeclan.example.Folderama.repositories;

import com.codeclan.example.Folderama.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<User, Long> {
}
