package com.test.spring.transaction.ItemDao;

import com.test.spring.transaction.Item;

public class ItemServiceImpl {
	
	private ItemDao itemDao;
	
	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void constructItem(){
		
		Item item = new Item();
		item.setItemName("Reebok Shoes");
		item.setItemPrice(356.78);
		getItemDao().saveItemObject(item);
		
	}

}
