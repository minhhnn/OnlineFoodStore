package com.onlinefoodstore.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Market place
 * @author minh
 *
 */
public class Market {
	private Map<Seller, Set<Product>> market;
	
	public Market() {
		market = new HashMap<>();
	}
	
	/**
	 * Add item to market place
	 * @param seller seller
	 * @param item item to sale
	 * @return
	 */
	public void addItemToMarket(Seller seller, Product item) {
		if (!market.containsKey(seller)) {
			market.put(seller, new HashSet<>());
		}
		
		market.get(seller).add(item);
	}
	
	/**
	 * Add item to market place
	 * @param seller seller
	 * @param item item to sale
	 * @return
	 */
	public void removeItemFromMarket(Seller seller, Product item) {
		if (market.containsKey(seller)) {
			market.get(seller).remove(item);
		}
	}
}
