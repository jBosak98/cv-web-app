package com.jbosak.familyserver.FamilyBackend.repositories;

import com.jbosak.familyserver.FamilyBackend.model.Father;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FatherRepository extends CrudRepository<Father, Long> {
    Optional<Father> findById(Long id);
    void deleteById(Long id);
}
