package com.tca.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@Column(name = "status")
	private OrderStatus orderStatus;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cust_id")
	private Customer customer;
}
