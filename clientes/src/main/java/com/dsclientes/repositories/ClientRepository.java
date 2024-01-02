package com.dsclientes.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dsclientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
