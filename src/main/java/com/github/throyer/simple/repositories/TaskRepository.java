/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.throyer.simple.repositories;

import com.github.throyer.simple.models.Situation;
import com.github.throyer.simple.models.Task;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author renato
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findBySituation(Situation situation);
}
