package com.example.microservice_crud_khoa.repository;

import com.example.microservice_crud_khoa.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa,Long> {
}
