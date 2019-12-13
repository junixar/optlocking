package com.adcubum.migration.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.envers.Audited;

@Entity
@Audited
public class Person {

   @Id
   public String id;
   
   @Column
   @Version
   public Long version;

   @Column
   public String firstname;

   @Column
   public String lastname;
   
}
