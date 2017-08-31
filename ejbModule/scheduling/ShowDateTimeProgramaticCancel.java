package scheduling;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Singleton
@Startup
public class ShowDateTimeProgramaticCancel {

	private final static String SINGLE_ACTION_STRING = "singleActionString"; //or any Serializable obj
	
	@Resource
	TimerService timerService;
	
	int repeatValue = 3;
	
	@PostConstruct
	public void init(){
		final ScheduleExpression expression = new ScheduleExpression();
		expression.second("*/10").minute("*").hour("*");
		
		final TimerConfig timerConfig = new TimerConfig();
		timerConfig.setInfo(SINGLE_ACTION_STRING);
		Timer timer = timerService.createCalendarTimer(expression, timerConfig);
	}
	
	@Timeout
	public void timeout(Timer timer) {
		repeatValue--;
		System.out.println("ShowDateTimeProgramaticCancel: timeout occurred; repeatValue decreased");
		
		
		final Collection<Timer> timers = this.timerService.getTimers();
		for (final Timer t: timers) {
			if (SINGLE_ACTION_STRING.equals(t.getInfo()) && repeatValue < 1) {
				System.out.println("ShowDateTimeProgramaticCancel: Stopped");
				t.cancel();
			}
		}
	}
}
