package com.spring.exemplos.crud.dezembro082020.repository;

import com.spring.exemplos.crud.dezembro082020.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
