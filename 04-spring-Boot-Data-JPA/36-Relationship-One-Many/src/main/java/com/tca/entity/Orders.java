package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Orders {

	@Id
	private Long OrderId;
	
	private LocalDate datePurchased;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private OrderStatus orderStatus;
}
