package tests;

import java.util.ArrayList;

import junit.framework.Assert;
import gene.Gene;
import gene.IGene;

import org.junit.Before;
import org.junit.Test;

import chromosome.Chromosome;
import chromosome.IChromosome;

/**
 * Set of tests for a chromosome class ( solutions )
 * @author ”Basem”
 *
 */
public class ChromosomeTest {
	
	/**
	 * Chromosome being tested
	 */
	private IChromosome chromosome;
	
	/**
	 * a gene being added to the choromose
	 */
	private IGene firstGene = new Gene<Integer>();
	
	/**
	 * second gene to be added to the choromosome
	 */
	private IGene secondGene = new Gene<Boolean>();
	
	/**
	 * Array list of genes used for testing
	 */
	private ArrayList geneArray;
	
	/**
	 * set a new chromosome and add some genes to it
	 */
	@Before
	public void setUp() {
		geneArray = new ArrayList<IGene>();
		geneArray.add(firstGene);
		geneArray.add(secondGene);
		
		chromosome = new Chromosome();
		chromosome.addGene(firstGene);
		chromosome.addGene(secondGene);
	}
	
	/**
	 * test for getting the single NEXT gene
	 */
	@Test
	public void testGetNextGene() {
		Assert.assertEquals(firstGene, chromosome.getNextGene());
	}
	
	/**
	 * test for getting the current number of genes in the chromosome
	 */
	@Test
	public void testGetNumberOfGenes() {
		Assert.assertEquals(geneArray.size(), chromosome.getNumberOfGenes());
	}
	
}
