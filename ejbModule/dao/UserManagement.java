package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserManagement {
	
	@PersistenceContext
	private EntityManager entityManager;

}
