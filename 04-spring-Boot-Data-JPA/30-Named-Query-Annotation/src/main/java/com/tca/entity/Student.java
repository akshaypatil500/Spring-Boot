package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@NoArgsConstructor
@Data
@AllArgsConstructor
@NamedQuery(name="Student.findAllByGreterThanPerAndGender",
            query="select s from Student s where s.per>=:per and s.gender=:gender")
@NamedQuery(name="Student.updateByName",
            query="update Student s set s.name=:name where s.rno=:rno")
@NamedQuery(name="Student.findByGenderAndName",
		    query="select s.name,s.gender from Student s")
@NamedQuery(name="Student.countByGender",
            query="select s.gender,count(s) from Student s group by s.gender" )
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
