package com.adcubum.optlocking.domain;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Collection;

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
