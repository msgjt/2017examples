package locking;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import dao.UserManagement;
//import entities.User;

@Stateless
public class LockingImpl implements Serializable {

	@EJB
	UserManagement userManagement;
	
	/* (non-Javadoc)
	 * @see locking.Locking#updateUser(int, java.lang.String)
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void updateUser(final int idUser, final String newName){
		//final User selectedUser = userManagement.getUserByIdAndLockPessimistic(idUser);
//		selectedUser.setLastName(newName);
//		userManagement.updateUser(selectedUser);
	}
	
	public LockingImpl() {
		super();
	}
	
}
