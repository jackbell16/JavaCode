package patterns.observer;
import java.util.TimerTask;

public class ConcreteSubject extends Subject {
 public void setState() {
	 java.util.Timer timer = new java.util.Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				notifyObservers();
				}
		};
		timer.schedule(task, 0, 2000);
	}
}