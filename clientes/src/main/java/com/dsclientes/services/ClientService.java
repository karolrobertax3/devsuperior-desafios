package com.dsclientes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsclientes.dto.ClientDTO;
import com.dsclientes.entities.Client;
import com.dsclientes.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findByIdClientDTO(Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
		 
		
	}
}