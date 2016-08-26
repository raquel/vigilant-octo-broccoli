package com.concretesolutions.repository;

import com.concretesolutions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by raquel on 8/26/16.
 */
public interface RegisterRepository extends JpaRepository<User, Long> {
}
