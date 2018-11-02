package com.jbosak.familyserver.FamilyBackend.repositories;

import com.jbosak.familyserver.FamilyBackend.model.Child;
import com.jbosak.familyserver.FamilyBackend.model.Father;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ChildRepository extends CrudRepository<Child, Long> {
    Optional<Child> findById(Long id);
}
