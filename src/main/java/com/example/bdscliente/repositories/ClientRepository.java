package com.example.bdscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bdscliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
