package com.stockmanagement;

import java.util.ArrayList;

public class StockPortfolio {
	private  ArrayList<StockManagement> stockList = new ArrayList<StockManagement>();

	void addStock(StockManagement stock) {
		stockList.add(stock);
	}

	void calculateEachStock() {
		for(StockManagement stock : stockList) {
			System.out.println("Stock Name :"+ stock.getStockName()+ " ||| Total value of shares Rs.:" +stock.getNoOfShares() * stock.getSharePrice());
		}
	}

	void totalValueStocks() {
		int stocksValue = 0;
		for(StockManagement stock : stockList) {
			stocksValue += stock.getNoOfShares() * stock.getSharePrice();
		}

		System.out.println("Total value of stocks Rs.:" + stocksValue);
	}

	void infoPortfolio() {
		calculateEachStock();
		totalValueStocks();
	}
}
