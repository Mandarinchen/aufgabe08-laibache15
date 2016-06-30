package at.fhj.itm;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 
 * @author Marina
 *
 */

public class StringQueue implements Queue {
	
	ArrayList <String> list = new ArrayList<String>();

	/**
	 * if it is possible to add a object it will return true otherwise return false
	 */

	@Override
	public boolean offer(String obj) {
		if(list.add(obj)){
			return true;
		}
		return false;
	}

	/**
	 * add or remove a obj to the Queue if it is empty it will return 0, only used once
	 */
	
	@Override
	public String poll() {
		if(list.isEmpty()){
			return null;
		}
		return list.remove(0);
	}

	/**
	 * remove is like the poll() Methode but if the Queue is empty it will throw an exeption
	 */
	
	@Override
	public String remove() {
		if(list.isEmpty()){
			throw new NoSuchElementException("Queue is empty!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		return list.remove(0);
	}

	/**
	 * returns Headelement but don't delete it so wei can use it more often
	 */
	
	@Override
	public String peek() {
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}
	
	/**
	 * it is like the peek() Method but if it is empty it throws an exaption
	 */
	
	@Override
	public String element() {
		if(list.isEmpty()){
			throw new NoSuchElementException("No elements found!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		return list.get(0);
	}

}
