package com.curso.atv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.atv.entity.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
