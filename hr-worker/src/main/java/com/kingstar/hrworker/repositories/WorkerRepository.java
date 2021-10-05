package com.kingstar.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingstar.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
