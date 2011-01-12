package tests;

import gene.Gene;
import gene.IGene;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class for the Gene class family
 * @author ”Basem”
 *
 */
public class GeneTest {
	/**
	 * the first parameter for a double gene 
	 */
	private static final double FIRST_DOUBLE_PARAMETER = 3.4;
	
	/**
	 * Second dobule parameter for a double gene
	 */
	private static final double SECOUND_DOUBLE_PARAMETER = 2.1;
	
	private static ArrayList parameterArray;
	
	/**
	 * The gene to test
	 */
	private IGene aGene;
	
	/**
	 * initialize the gene and add some parameters
	 */
	@Before
	public void setUp() {
		
		parameterArray = new ArrayList();
		aGene = new Gene<Double>();
		
		parameterArray.add(FIRST_DOUBLE_PARAMETER);
		parameterArray.add(SECOUND_DOUBLE_PARAMETER);
		aGene.addParameter(FIRST_DOUBLE_PARAMETER);
		aGene.addParameter(SECOUND_DOUBLE_PARAMETER);
		
	}
	
	/**
	 * has next should return when gene still hasnt iterated over all its elements
	 */
	@Test
	public void testHasNext() {
		Assert.assertTrue(aGene.hasNext());	// true since we had 2 elements
		Assert.assertEquals(FIRST_DOUBLE_PARAMETER, aGene.getNextParameter()); // get the first parameter
		Assert.assertTrue(aGene.hasNext());	// true we had 1 more parameter
		Assert.assertEquals(SECOUND_DOUBLE_PARAMETER, aGene.getNextParameter()); // get the second parameter
		Assert.assertFalse(aGene.hasNext());	// false, no more parameters
		Assert.assertTrue(aGene.hasNext());	// true,
		Assert.assertEquals(FIRST_DOUBLE_PARAMETER, aGene.getNextParameter()); // should get the first parameter after a reset
	}
	
	/**
	 * get next parameter should return the first parameter added when its called the first time
	 */
	@Test
	public void testGetNextParameter() {
		Assert.assertEquals(FIRST_DOUBLE_PARAMETER, aGene.getNextParameter());
		Assert.assertEquals(SECOUND_DOUBLE_PARAMETER, aGene.getNextParameter());
	}
	
	/**
	 * test that the set parameter array is the same when retrieved
	 */
	@Test
	public void testSetParameterArray() {
		aGene.setParameterArray(parameterArray);
		Assert.assertArrayEquals(parameterArray.toArray(), aGene.getParameterArray().toArray());
	}
	
	/**
	 * test getting the number of the parameters in a gene
	 */
	@Test
	public void testGetNumberOfParameters() {
		Assert.assertEquals(parameterArray.size(), aGene.getNumberOfParameters());
	}
}
