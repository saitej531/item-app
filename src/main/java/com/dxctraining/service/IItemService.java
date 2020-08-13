package com.dxctraining.service;

import com.dxctraining.entities.Item;


public interface IItemService {
	
	

	Item findItemById(int id);

    Item update(Item item);

    Item save(Item item);

    void remove(int id);


}
