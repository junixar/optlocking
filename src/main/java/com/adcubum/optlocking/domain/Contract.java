package com.adcubum.optlocking.domain;

import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
