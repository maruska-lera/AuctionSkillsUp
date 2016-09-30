package com.su.service.impl;

import com.su.dao.ItemDao;
import com.su.domain.Item;
import com.su.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> getItems() {
        return itemDao.getAll();
    }

    @Override
    public Item createItem(String title, String description) {
        Item item = new Item();
        item.setTitle(title);
        item.setDescription(description);
        return item;
    }
}
