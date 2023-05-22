package com.fiap.aml.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.aml.domain.Identity;
import com.fiap.aml.repository.IdentityRepository;
import com.fiap.aml.services.exceptions.ObjectNotFoundException;

@Service
public class IdentityService {
	
	@Autowired
	IdentityRepository repo;
	
	public List<Identity> findAll() {
		return repo.findAll();
	}
	
	public Identity findById(String id) {
		Optional<Identity> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found."));
	}
	
	public List<Identity> findByName(String name) {
		return repo.findByNameContainingIgnoreCase(name);
	}
}
