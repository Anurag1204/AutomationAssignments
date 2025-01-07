package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
	
	List<String> grocery = new ArrayList<>();

    public void addItemsGroceryList(String item) {
        System.out.println("***Items added in the grocerylist***");
        grocery.add(item);
        System.out.println(grocery);
    }

    public void removeItemsGroceryList(String item) {

        System.out.println("***Remove operation performed***");
        grocery.remove(item);

    }

    public void viewList() {

        System.out.println("***list is as follows***");
        System.out.println(grocery);
    }
}


