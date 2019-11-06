package com.adcubum.optlocking.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

@Entity
@Audited
public class Contract {

   @Id
   public String id;

   @Column
   public String name;

   //   @ManyToOne
   //   public Person person;

}
