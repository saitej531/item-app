package com.dxctraining.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.dao.IItemDao;
import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.InvalidArgumentException;

@Transactional
@Service
public  class ItemServiceImpl implements IItemService {
	
	
	@Autowired
	private IItemDao dao;
	
	
	public Item findItemById(int id) {
	       Item item= dao.findItemById(id);
	        return item;
	    }


	    @Override
	    public Item update(Item item) {
	        validate(item);
	        item=dao.update(item);
	        return item;
	    }

	    @Override
	    public Item save(Item item) {
	        validate(item);
	       item=dao.save(item);
	        return item;
	    }

	    @Override
	    public void remove(int id) {
	       dao.remove(id);
	    }
	    
	    public void validate(Object arg){
	        if(arg==null){
	            throw new InvalidArgumentException("argument is null");
	        }
	    }

	

}
