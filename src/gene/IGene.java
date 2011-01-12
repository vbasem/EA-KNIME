package gene;

import java.util.Collection;

/**
 * The interface of the gene class
 * @author ”Basem”
 *
 */
public interface IGene<T> {
	
	/**
	 * adds a single parameter
	 */
	public abstract void addParameter(T parameter);
	
	/***
	 * gets the next element and increment the iterator
	 */
	public abstract T getNextParameter();
	
	/**
	 * setter for an array of parameters
	 */
	public abstract void setParameterArray(Collection<T> parameterArray);
	
	/**
	 * Getter for an array of parameters
	 */
	public abstract Collection<T> getParameterArray();
	
	/**
	 * indicates if we have more parameters to iterate over
	 */
	public abstract boolean hasNext();
	
	/**
	 * return the number of parameters in the gene 
	 */
	public abstract int getNumberOfParameters();
	

}
