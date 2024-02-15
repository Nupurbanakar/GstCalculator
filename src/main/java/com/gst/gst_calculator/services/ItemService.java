package com.gst.gst_calculator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.gst_calculator.repository.ItemRepository;
import com.gst.gst_calculator.models.Item;

@Service
public class ItemService {
    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @SuppressWarnings("null")
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }
    
}
