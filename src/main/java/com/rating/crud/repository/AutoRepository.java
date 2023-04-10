package com.rating.crud.repository;

import com.rating.crud.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Auto,Integer> {
}
