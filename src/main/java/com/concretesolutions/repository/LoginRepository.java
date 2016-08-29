package com.concretesolutions.repository;

import com.concretesolutions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<User, Long> {

    @Query("SELECT u from User u where u.email = ?1")
    User findByEmail(String email);

}
