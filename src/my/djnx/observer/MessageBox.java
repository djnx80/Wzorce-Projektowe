package my.djnx.observer;

import java.util.ArrayList;

public class MessageBox implements Subject {

	private ArrayList<Observer> observerList;
	
	public MessageBox()	{
		observerList = new ArrayList<>();
	}
	
	public void newMessage()	{
		System.out.println("New message appeared on the forum.");
		notifyObservers();
	}
	@Override
	public void register(Observer o) {
		System.out.println(o.getName() + " has log in!");
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		System.out.println(o.getName() + " has loged out!");
		observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observerList){
			o.update();
		}
		
	}



}
