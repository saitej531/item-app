package com.dxctraining.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.entities.*;
import com.dxctraining.exceptions.ItemNotFoundException;


@Repository
public  class ItemDaoImpl implements IItemDao {
	
	
	@PersistenceContext
	public EntityManager entitymanager;
	
	
	 public Item findItemById(int id) {
	        Item item=entitymanager.find(Item.class,id);
	        if(item==null){
	            throw new ItemNotFoundException("Item not found for id="+id);
	        }
	        return item;
	    }
	 
	 
	    public Item update(Item item) {
	        item=entitymanager.merge(item);
	        return item;
	    }
	    
	    public Item save(Item item) {
	        entitymanager.persist(item);
	        return item;
	    }

	    
	    public void remove(int id) {
	     Item item= entitymanager.find(Item.class,id) ;
	     entitymanager.remove(item);
	    }
	 
	 
	 
	 
	
	
	

}
