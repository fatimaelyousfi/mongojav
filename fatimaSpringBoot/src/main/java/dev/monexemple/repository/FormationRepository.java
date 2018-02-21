package dev.monexemple.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.monexemple.entite.Formation;

public interface FormationRepository extends MongoRepository<Formation, String> {

}
