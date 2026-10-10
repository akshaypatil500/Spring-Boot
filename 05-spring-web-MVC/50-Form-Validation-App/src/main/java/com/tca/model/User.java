package com.tca.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	
    @NotBlank(message = "Name is Required")
    @Size(min=6,max=10,message = "User Must have atleast 6 character")
	private String username;
	
    @NotBlank(message = "Email Should not be Empty")
	@Email(message = "Invalid Email Id")
	private String email;
	
	@Pattern(regexp ="\\d{10}",message = "Phone Number Should have 10 digit ")
	private String mobile;
	
    @NotBlank(message = "Gender is not provided")
	private String gender;

}
