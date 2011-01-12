package chromosome;

import java.util.ArrayList;

import gene.IGene;

/**
 * The abstract chromosome with most of the setters and getters pre implemented.
 * 
 * @author ”Basem”
 *
 */
public class AbstractChromosome implements IChromosome{
	
	/**
	 * The genes are stored in this array
	 */
	private ArrayList<IGene> genes = new ArrayList<IGene>();
	
	/**
	 * used to store the iterators position as we iterate through the genes
	 */
	int iteratorPosition = 0;
	
	@Override
	public void addGene(IGene aGene) {
		genes.add(aGene);
		
	}
	
	/**
	 * returns null if the no more items to iterate over
	 */
	@Override
	public IGene getNextGene() {
		if (iteratorPosition < getNumberOfGenes()) {
			return genes.get(iteratorPosition++);
		}
		return null;
	}

	@Override
	public int getNumberOfGenes() {
		return genes.size();
	}
	
	
	/**
	 * resets the iterator to 0 
	 */
	private void resetIterator() {
		iteratorPosition = 0;
	}

}
