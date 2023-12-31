package com.thy.airport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AIRPORT")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Airport {

  @Id
  @SequenceGenerator(name = "AIRPORT_ID_GENERATOR", sequenceName = "AIRPORT_ID_GEN", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIRPORT_ID_GENERATOR")
  @Column(name = "ID",unique = true, nullable = false)
  private int id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "CODE", length = 3)
  private String code;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CITY_ID")
  private City city;

}
