import static org.junit.Assert.*;

import org.junit.Test;

public class TestJenkis {
	
 Joueur j = new Joueur("Zizou",40,"Madrid");
	@Test
	public void simpleTest(){
		int a=1;
		int b =1;
		assertEquals(a, b);
	}
	
	@Test
	public void JoueurTest(){
		assertEquals(j.getName(), "Zizou");
	}

}
