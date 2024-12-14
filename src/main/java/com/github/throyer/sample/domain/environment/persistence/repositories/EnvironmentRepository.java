package com.github.throyer.sample.domain.environment.persistence.repositories;

import com.github.throyer.sample.domain.environment.persistence.models.Environment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvironmentRepository extends JpaRepository<Environment, Long> {
}
