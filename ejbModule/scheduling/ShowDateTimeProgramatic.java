package scheduling;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

@Singleton
@Startup
public class ShowDateTimeProgramatic {
	
	@Resource
	TimerService timerService;
	
	@PostConstruct
	public void init(){
		final ScheduleExpression expression = new ScheduleExpression();
		expression.second("*/10").minute("*").hour("*");
		timerService.createCalendarTimer(expression);
		
	}
	
	@Timeout
	public void timeout(Timer timer) {
		// System.out.println("ShowDateTimeProgramatic: timeout occurred");
	}
}
