package scheduling;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateless;

@Stateless
@Startup
public class ShowDateTimeAutomaticSimple {
	
	@Schedule(second="*/5", minute="*", hour="*")
	public void doShowTime() {
		System.out.println("ShowDateTimeAutomaticSimple: doShowTime:" + new Date());
	}
	
}
