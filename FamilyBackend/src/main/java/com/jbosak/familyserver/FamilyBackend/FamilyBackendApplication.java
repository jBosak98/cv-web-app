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
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
//		try {
//			EntityManager em =  emf.createEntityManager();
//			nativeQuery(em,"SHOW TABLES");
//			emf.close();
//		} finally {
//			emf.close();
//		}
		Family family = new Family();

	}
	public static void nativeQuery(EntityManager em, String s) {
		System.out.printf("-----------------------------%n'%s'%n",  s);
		Query query = em.createNativeQuery(s);
		List list = query.getResultList();
		for (Object o : list) {
			if(o instanceof Object[]) {
				System.out.println(Arrays.toString((Object[]) o));
			}else{
				System.out.println(o);
			}
		}
	}
}
