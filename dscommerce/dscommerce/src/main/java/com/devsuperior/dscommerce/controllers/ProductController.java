package com.devsuperior.dscommerce.controllers;

import java.net.URI;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dscommerce.dto.CustomError;
import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;
import com.devsuperior.dscommerce.services.ProductService;
import com.devsuperior.dscommerce.services.exceptions.ResourceNotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/products")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity <ProductDTO> findById(@PathVariable Long id) {
			ProductDTO dto = service.findById(id);
			return ResponseEntity.ok(dto);
			
	}
	
	@GetMapping()
	public ResponseEntity <Page<ProductDTO>>findAll(@PageableDefault(size=10) Pageable pageable) {
		Page<ProductDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping()
	public ResponseEntity<ProductDTO> insert(@Valid @RequestBody ProductDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity <ProductDTO> update(@PathVariable Long id, @Valid @RequestBody ProductDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity <Void> update(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
