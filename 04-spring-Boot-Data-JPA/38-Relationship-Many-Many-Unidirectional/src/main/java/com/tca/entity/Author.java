package com.tca.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {

	@Id
	private Long aid;
	
	private String authorName;
	
	@ManyToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Book> book;
}
