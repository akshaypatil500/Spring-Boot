package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@NoArgsConstructor
@Data
@AllArgsConstructor
@NamedNativeQuery(name="Student.findByGreterThanPerAndGender",
            query="select * from student where per>=:per and gender=:gender",
            resultClass = Student.class)

@NamedNativeQuery(
	    name = "Student.updateByName",
	    query = "UPDATE student SET name = :name WHERE rno = :rno"
	    
	)

@NamedNativeQuery(
	    name = "Student.findByGenderAndName",
	    query = "SELECT name, gender FROM student " +
	            "WHERE name = :name AND gender = :gender"
	           
	)

@NamedNativeQuery(
	    name = "Student.countByGender",
	    query = "SELECT gender, COUNT(*) FROM student GROUP BY gender"
	   
	)

public class Student {
	
	@Id 
	private Integer rno;
	
	private String name;
	
	private Double per;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name="BIRTH_DATE")
	private LocalDate birthDate;
	

}
