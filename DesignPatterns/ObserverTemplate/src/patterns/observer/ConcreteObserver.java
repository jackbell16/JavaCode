 package patterns.observer;

public class ConcreteObserver implements Observer {
	@Override
    public void update() {
        System.out.println("Sono passati due secondi");
    }
}