package com.dxctraining.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.exceptions.ItemNotFoundException;
import com.dxctraining.service.IItemService;

@Component
public class ItemUi {
	
	 @Autowired
	public IItemService service;
	 
	 
	 @PostConstruct
	 public void runUi() {
		 
		 
		 try {
			 Item item1 = new Item("sai",21);
	            Item item2 = new Item("teja",22);
	            
	            item1=service.save(item1);
	            item2=service.save(item2);
	            

	            int id2 = item2.getId();
	            Item fetched = service.findItemById(id2);
	            
	            
	            System.out.println("fetcehd item =" + fetched.getName() + " " + fetched.getId());
	            
	            
	            
		 }catch(ItemNotFoundException e) {
			 e.printStackTrace();
		 }
		 
		 catch(InvalidArgumentException e) {
			 e.printStackTrace();
		 }
		 
		 
	 }
	

}
