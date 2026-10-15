package com.tca.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	
    @NotBlank
    @Size(min=6,max=10)
	private String username;
	
    @NotBlank
	@Email
	private String email;
	
	@Pattern(regexp ="\\d{10}")
	private String mobile;
	
    @NotBlank
	private String gender;
    
    @NotNull(message = "Birth date is required")
    @Past(message = "Birth date must be in the past")
    private LocalDate bdate;

}
