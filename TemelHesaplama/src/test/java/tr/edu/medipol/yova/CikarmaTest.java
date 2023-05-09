package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testIslemYapBirinciİkincidenKucukken() {
		int sonuc = Cikarma.islemYap(80, 90);
		assertEquals(-10, sonuc);
	}
	@Test
	public void testIslemYapBirinciİkincidenBuyukken() {
		int sonuc = Cikarma.islemYap(100, 40);
		assertEquals(60, sonuc);
	}
	@Test
	public void testIslemYapNegatifSayiIcin() {
		int sonuc = Cikarma.islemYap(-14, -13);
		assertEquals(-1, sonuc);
	}
}
