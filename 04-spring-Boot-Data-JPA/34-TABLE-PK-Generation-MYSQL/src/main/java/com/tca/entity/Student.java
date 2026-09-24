package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student {
	
	@Id
	@TableGenerator(
			       name="rno_gen",
			       table="id_generator",
			       pkColumnName = "gen_name",
			       valueColumnName = "gen_value",
			       pkColumnValue = "student_id",
			       allocationSize = 1
			       
			       )
	@GeneratedValue(strategy = GenerationType.TABLE,
	                 generator = "rno_gen")
	private Integer rno;
	
	private String name;
	
	private Double per;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private LocalDate birthDate;
	

}
