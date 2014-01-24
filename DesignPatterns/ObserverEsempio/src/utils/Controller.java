package utils;


public class Controller extends Subject {
public void setChanged(){
	notifyObservers();
	}
}