package com.javaee8.restswagger.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private Long id;
	
	private String name;
	
	private String password;
	
	private Boolean active;
}