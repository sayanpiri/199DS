package com.mph.testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("Sayan");
		String str2 = new String("Sumon");
		String str3 =null;
		String str4="abhi";
		String str5="abhi";
		
		
		int val1=56;
		int val2=65;
		
		String[] arr1={"one","two","three"};
		String[] arr2={"one","two","three"};
		
		assertEquals(str4, str5);
		//assertSame(str4, str5);
		assertNotSame(str1, str2);
		//assertTrue(val1<val2);
		assertFalse(val1<val2);
		//assertNotNull(str3);
		assertArrayEquals(arr1, arr2);
		
	}

}