package com.concretesolutions.repository;

import com.concretesolutions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfileRepository extends JpaRepository<User, Long> {
}
