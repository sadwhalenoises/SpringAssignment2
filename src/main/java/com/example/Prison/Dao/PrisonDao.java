package com.example.Prison.Dao;

import com.example.Prison.Entity.Prison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisonDao extends JpaRepository<Prison, Integer> {
}
