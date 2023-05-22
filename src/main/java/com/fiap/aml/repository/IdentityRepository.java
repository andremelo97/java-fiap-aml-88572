package com.fiap.aml.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fiap.aml.domain.Identity;

@Repository
public interface IdentityRepository extends MongoRepository<Identity, String> {

	List<Identity> findByNameContainingIgnoreCase(String name);
	
}
