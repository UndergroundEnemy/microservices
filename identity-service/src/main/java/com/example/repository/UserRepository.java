package com.example.repository;

import com.example.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserCredential, Long> {

    @Query(value = "select * from users where username = :username", nativeQuery = true)
    Optional<UserCredential> findByUsername(@Param("username") String username);

}
