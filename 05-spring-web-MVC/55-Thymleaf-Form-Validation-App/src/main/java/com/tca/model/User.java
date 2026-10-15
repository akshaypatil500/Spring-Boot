package com.tca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	private String username;
	
	private String email;
	
	private Long mobile;
	
	private String gender;

}
