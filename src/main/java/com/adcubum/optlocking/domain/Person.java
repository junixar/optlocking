package com.adcubum.optlocking.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

   @Id
   public String id;

   @Column
   public String name;

   @Column
   public Date birthday;
   
}
