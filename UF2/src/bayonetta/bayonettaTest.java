package bayonetta;

import static org.junit.Assert.*;

import org.junit.Test;

public class bayonettaTest {

	@Test
	public void testCombo() {
		
		assertEquals(210, bayonetta.combo(2, 2, 10, 1, 0, 2));
		assertEquals(84, bayonetta.combo(1, 3, 10, 1, 0, 3));
		assertEquals(111, bayonetta.combo(3, 1, 10, 1, 0, 1));
		assertEquals(1179630, bayonetta.combo(4, 4, 10, 1, 0, 4));
	}

}
