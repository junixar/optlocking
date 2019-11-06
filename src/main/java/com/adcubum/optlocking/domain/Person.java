package com.adcubum.optlocking.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.hibernate.envers.Audited;

@Entity
@Audited
public class Person {

   @Id
   public String id;

   @Column
   public String name;

   @Column
   @Version
   public Long version;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "person_id", nullable = false)
   public Collection<Contract> contracts;

}
