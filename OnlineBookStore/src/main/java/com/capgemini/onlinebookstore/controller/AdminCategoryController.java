package com.capgemini.onlinebookstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinebookstore.domain.CategoryDto;
import com.capgemini.onlinebookstore.exception.InvalidDataException;
import com.capgemini.onlinebookstore.service.AdminService;

@RestController
@RequestMapping("/v1/admin")
public class AdminCategoryController {

	@Autowired
	AdminService service;
	
	
	@GetMapping("/allCategories")
	public ResponseEntity<List<CategoryDto>> fetchAllCategory(){
		return new ResponseEntity<>(service.fetchAllCategory(),HttpStatus.OK);
	}
	
	@PostMapping("/addCategory")
	public ResponseEntity<CategoryDto>addUser(@Valid @RequestBody CategoryDto dto,BindingResult result) throws InvalidDataException{
		
    	return new ResponseEntity<>(service.addCategory(dto,result),HttpStatus.OK);
    }
	
	@GetMapping("/getbyCategoryName/{name}")
	   public ResponseEntity<CategoryDto>findDistributorById( @PathVariable("name")  String name){
	      return new ResponseEntity<>(service.findByCategoryName(name),HttpStatus.OK);
	}
	
	@PutMapping("/updatDescription/{name}")
	public ResponseEntity<CategoryDto> updateDescription(@PathVariable("name")  String name,@Valid @RequestBody String dto)
	{
		System.out.println(dto);
		return new ResponseEntity<>(service.updateDescription(name,dto),HttpStatus.OK);
	}
	
}
