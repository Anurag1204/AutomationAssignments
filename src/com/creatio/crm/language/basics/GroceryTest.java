package com.creatio.crm.language.basics;

public class GroceryTest {

	public static void main(String[] args) {
		
		GroceryList obj = new GroceryList();

        obj.addItemsGroceryList("Fresh Fruits");
        obj.addItemsGroceryList("Milk and Bread");
        obj.addItemsGroceryList("Vegetables");


        obj.removeItemsGroceryList("Milk and Bread");


        obj.viewList();

	}

}
