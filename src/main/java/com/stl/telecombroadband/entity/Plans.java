package com.stl.telecombroadband.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity
	@Table(name="plans")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
	public class Plans{

		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		@Column(name="name")
		private String name;
		@Column(name="email")
		private String email;
		@Column(name="plan")
		private String planName;
		@Column(name="contact")
		private String contactNumber;
		@Column(name="address")
		private String address;
}
