package com.thy.airport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "COUNTRY")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Country {

  @Id
  @SequenceGenerator(name = "COUNTRY_ID_GENERATOR", sequenceName = "COUNTRY_ID_GEN", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COUNTRY_ID_GENERATOR")
  @Column(name = "ID",unique = true,nullable = false)
  private int id;

  @Column(name = "NAME")
  private String name;


}
