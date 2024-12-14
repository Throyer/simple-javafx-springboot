package com.github.throyer.sample.domain.sample.services;

import com.github.throyer.sample.domain.environment.persistence.repositories.EnvironmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class SampleService {
  EnvironmentRepository repository;
  
  public String getMessage() {
    log.info("size {}", repository.findAll().size());
    return "oi";
  }
}
