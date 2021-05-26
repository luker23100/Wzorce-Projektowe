package com.dev.SingletonTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.dev.Singleton.PriceList;

public class PriceListTest {
	
	@Test
	public void testIfSingleton() {
		//given
		PriceList list1 = PriceList.getInstance();
		PriceList list2 = PriceList.getInstance();
		
		//then
		assertSame(list1, list2);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5})
	public void testIfDynamicTableLengthRaises(int length) {
		//given
		PriceList list = PriceList.getInstance();
		
		//when
		list.addPrice(5.25);
		
		//then
		assertEquals(length, list.getPrices().length);
	}
}
