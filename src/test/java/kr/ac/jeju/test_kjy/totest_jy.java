package kr.ac.jeju.test_kjy;

import junit.framework.Assert;
import org.junit.Test;

public class totest_jy {

	@Test
	public void test() {
		Assert.assertEquals(2, add(1,1));
		Assert.assertEquals(3, add(1,2));
		//fail("Not yet implemented");
	}

	private int add(int i, int j) {
		return i+j;
	}
}