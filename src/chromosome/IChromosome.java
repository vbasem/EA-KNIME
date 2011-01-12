package chromosome;

import gene.IGene;

/**
 * The interface to a choromsome ( solution )
 * @author ”Basem”
 *
 */
public interface IChromosome {
	
	/**
	 * Add a single gene to the chromosome
	 */
	public abstract void addGene(IGene aGene);
	
	/**
	 * Getter for the next gene as long as the iterator 
	 * still shows we have genes left to return.
	 * After that iterator needs to be rested, else null will be returned
	 */
	public abstract IGene getNextGene();
	
	/**
	 * returns the current number of genes in the choromosome
	 */
	public abstract int getNumberOfGenes();
}
