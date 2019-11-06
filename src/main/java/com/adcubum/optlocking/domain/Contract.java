package com.adcubum.optlocking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Audited
public class Contract {

   @Id
   public String id;

   @Column
   public String name;
   
   @Column
   public String type;
   
   @Column
   public String street;

   //   @ManyToOne
   //   public Person person;

}
