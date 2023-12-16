package com.testproject.testproject.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testproject.testproject.Entities.client;

@Repository
public interface clientRepository extends JpaRepository<client, String> {

    List<client> findAll();

}
