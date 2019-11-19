package com.adcubum.optlocking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

   @Id
   public String id;

   @Column
   public String firstname;
}
