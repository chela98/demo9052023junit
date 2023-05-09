package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testCarpma() {
		
		int sayi1 = 2;
		int sayi2 = 3;
		int gercekSonuc = Carpma.islemYap(sayi1, sayi2);
		assertEquals(6, gercekSonuc);
	}

}
