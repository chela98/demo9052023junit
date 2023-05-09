package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	
	@Test
	public void testIslemYapBirinciİkincidenBuyukken() {
		int sonuc = Bolme.islemYap(100, 50);
		assertEquals(2, sonuc);
	}
	@Test
	public void testIslemYapNegatifSayiIcin() {
		int sonuc = Bolme.islemYap(-12, -4);
		assertEquals(3, sonuc);
	}
}
