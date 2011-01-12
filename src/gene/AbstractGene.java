package gene;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class offers the abstraction of a gene with generic implementation.
 * most methods are getters and setters + iterators
 * 
 * For convenience parameters are stored in an {@link ArrayList} as it is fast and generic
 * @author ”Basem”
 *
 * @param <T> while it can be any object , but for now focus on Integer, Double, boolean, char and String
 */
public abstract class AbstractGene<T> implements IGene<T> {
	
	/**
	 * variable used to store the current position of the iterator
	 * ( the element the iterator returns when {@link #getNextParameter()} is called
	 */
	private int iteratorPosition = 0;
	
	/**
	 * The array of the parameters where all the gene parameters are stoered
	 */
	private ArrayList<T> parameters = new ArrayList<T>();
	
	@Override
	public void addParameter(T parameter) {
		parameters.add(parameter);
	}
	
	/**
	 * return null if all elements were returned
	 * need to call {@link #hasNext()} to reset the iterator
	 */
	@Override
	public T getNextParameter() {
		if (iteratorPosition < getNumberOfParameters()) {
			return parameters.get(iteratorPosition++);
		}
		return null;
	}

	@Override
	public void setParameterArray(Collection<T> parameterArray) {
		parameters = (ArrayList<T>) parameterArray;
		
	}

	@Override
	public Collection<T> getParameterArray() {
		return parameters;
	}

	@Override
	public boolean hasNext() {
		if (iteratorPosition < getNumberOfParameters()) {
			return true;
		}
		
		/*--- otherwise reset the iterator and return false for future calls ---*/
		resetIterator();
		return false;
	}
	
	@Override
	public int getNumberOfParameters() {
		return parameters.size();
	}
	
	/**
	 * reset the iterator
	 */
	private void resetIterator() {
		iteratorPosition = 0;
	}

}
