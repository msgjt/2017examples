package locking;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;

@Stateless
public class LockingCallerImpl {
/*
	@EJB
	LockingImpl lockingEjb;
	
	@PostConstruct
	public void doCheck(){
		if (lockingEjb == null){
			System.out.println("To soon");
		}
	}
	/*
	@Schedule(second="*30", minute="*", hour="*")
	public void doUpdate() {
		lockingEjb.updateUser(1, "a");
		lockingEjb.updateUser(1, "b");
		lockingEjb.updateUser(1, "c");
		lockingEjb.updateUser(1, "d");
		lockingEjb.updateUser(1, "e");
		lockingEjb.updateUser(1, "f");
		lockingEjb.updateUser(1, "g");
		lockingEjb.updateUser(1, "h");
	}*/
}
