package com.vlad.putnikov.repository;

import com.vlad.putnikov.entity.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IndustryRepository extends JpaRepository<Industry, Long> {

    @Query(value = "SELECT * from industry where name = :name", nativeQuery = true)
    public Optional<Industry> findByName(@Param("name") String name);
}
