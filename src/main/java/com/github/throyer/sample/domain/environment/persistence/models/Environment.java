package com.github.throyer.sample.domain.environment.persistence.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "environment")
@Table(name = "environment")
public class Environment {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  
  @Column(name = "name")
  private String name;

  @Column(name = "base_url")
  private String baseUrl;
}
