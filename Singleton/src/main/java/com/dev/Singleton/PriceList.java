package com.dev.Singleton;

public class PriceList {
	private static PriceList priceList;
	private double[] prices;
	
	private PriceList() {
		prices = new double[0];
	}
	
	public void addPrice(double price) {
		double[] temp = new double[prices.length+1];
		for(int i=0; i<prices.length; i++)
			temp[i] = prices[i];
		
		temp[prices.length] = price;
		prices = temp;
	}
	
	public double[] getPrices() {
		return prices;
	}
	
	public static PriceList getInstance() {
		if(priceList == null) {
			priceList = new PriceList();
		}
		return priceList;
	}
}
