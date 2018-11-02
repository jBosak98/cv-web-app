package com.jbosak.familyserver.FamilyBackend;


import com.jbosak.familyserver.FamilyBackend.model.Family;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FamilyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyBackendApplication.class, args);
	}

}
