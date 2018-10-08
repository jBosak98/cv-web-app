package com.jbosak.familyserver.FamilyBackend.repositories;

import com.jbosak.familyserver.FamilyBackend.model.Child;
import org.springframework.data.repository.CrudRepository;

public interface ChildRepository extends CrudRepository<Child, Long> {
}
