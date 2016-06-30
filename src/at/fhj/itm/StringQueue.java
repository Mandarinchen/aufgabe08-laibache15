package at.fhj.itm;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 
<<<<<<< HEAD
 * @author Marina, edit by Antonela
=======
 * @author Marina
>>>>>>> 005582c39c562d12def031ea3b0287a3f43b8085
 *
 */

public class StringQueue implements Queue {
	
	ArrayList <String> list = new ArrayList<String>();

	/**
<<<<<<< HEAD
	 * adds and element in the Queue
	 * if it is possible to add a object it will return true otherwise return false
	 * @param element
	 */
=======
	 * if it is possible to add a object it will return true otherwise return false
	 */

>>>>>>> 005582c39c562d12def031ea3b0287a3f43b8085
	@Override
	public boolean offer(String obj) {
		if(list.add(obj)){
			return true;
		}
		return false;
	}

	/**
<<<<<<< HEAD
	 * add and remove a obj to the Queue if it is empty it will return 0, only used once
	 */
=======
	 * add or remove a obj to the Queue if it is empty it will return 0, only used once
	 */
	
>>>>>>> 005582c39c562d12def031ea3b0287a3f43b8085
	@Override
	public String poll() {
		if(list.isEmpty()){
			return null;
		}
		return list.remove(0);
	}

	/**
<<<<<<< HEAD
	 * remove is like the poll() Methode but if the Queue is empty it will throw an exception
	 */
=======
	 * remove is like the poll() Methode but if the Queue is empty it will throw an exeption
	 */
	
>>>>>>> 005582c39c562d12def031ea3b0287a3f43b8085
	@Override
	public String remove() {
		if(list.isEmpty()){
			throw new NoSuchElementException("Queue is empty!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		return list.remove(0);
	}

	/**
<<<<<<< HEAD
	 * returns Headelement but don't delete it so we can use it more often
	 */
=======
	 * returns Headelement but don't delete it so wei can use it more often
	 */
	
>>>>>>> 005582c39c562d12def031ea3b0287a3f43b8085
	@Override
	public String peek() {
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}
	
	/**
<<<<<<< HEAD
	 * it is like the peek() Method but if it is empty it throws an exception
	 * @return list
=======
	 * it is like the peek() Method but if it is empty it throws an exaption
>>>>>>> 005582c39c562d12def031ea3b0287a3f43b8085
	 */
	
	@Override
	public String element() {
		if(list.isEmpty()){
			throw new NoSuchElementException("No elements found!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		return list.get(0);
	}

}
