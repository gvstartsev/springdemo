package ru.startsev.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.startsev.springdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
