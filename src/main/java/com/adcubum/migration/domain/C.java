package com.adcubum.migration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class C {
	@Id
	   public String id;

	   @Column
	   public String firstname;
}
