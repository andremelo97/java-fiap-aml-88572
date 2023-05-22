package com.fiap.aml.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.aml.configuration.dto.IdentityDTO;
import com.fiap.aml.domain.Identity;
import com.fiap.aml.resources.util.URL;
import com.fiap.aml.services.IdentityService;

@RestController
@RequestMapping(value="/identities")
public class IdentityResource {
	
	@Autowired
	IdentityService service;
	
	@GetMapping
	public ResponseEntity <List<IdentityDTO>> findAll() {	
		List<Identity> list = service.findAll();
		List<IdentityDTO> listDto = list.stream().map(x -> new IdentityDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Identity> findById(@PathVariable String id) {
		Identity obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value="/titlesearch")
	public ResponseEntity<List<Identity>> findByTitle(@RequestParam(value="name", defaultValue="") String name) {		
		name = URL.decodeParam(name);
		List<Identity> list = service.findByName(name);
		return ResponseEntity.ok().body(list);
	}
}
