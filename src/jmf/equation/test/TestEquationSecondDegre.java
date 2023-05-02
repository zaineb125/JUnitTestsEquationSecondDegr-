package jmf.equation.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jmf.equation.PolynomeSecondDegre;

public class TestEquationSecondDegre {
	
	@Test
	public void test2Racines() {
		PolynomeSecondDegre polynomeSecondDegre =new PolynomeSecondDegre(1,1,-2);
		double racines[]=polynomeSecondDegre.calculRacines();
		assertEquals(1, racines[0],0.0001);
        assertEquals(-2, racines[1],0.0001);
	}
	@Test
	public void test1Racine() {
		PolynomeSecondDegre polynomeSecondDegre =new PolynomeSecondDegre(1,-2,1);
		double racines[]=polynomeSecondDegre.calculRacines();
		int length = racines.length ;
		assertEquals(1,length);
		assertEquals(1, racines[0],0.0001);
	}
	@Test
	public void testPasDeRacineReelle() {
		PolynomeSecondDegre polynomeSecondDegre =new PolynomeSecondDegre(1,1,1);
		double racines[]=polynomeSecondDegre.calculRacines();
		assertEquals(null,racines);
	}
}
