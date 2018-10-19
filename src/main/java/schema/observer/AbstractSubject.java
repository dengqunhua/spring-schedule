package schema.observer;

import java.util.List;

import com.google.common.collect.Lists;

public  abstract class AbstractSubject implements Subject{
	private List<Observer> list =Lists.newArrayList();
	public void add(Observer observer){
		list.add(observer);
		
	}
	public void delete(Observer observer){
		list.remove(observer);
		
	}

}
