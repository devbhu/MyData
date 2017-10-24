package com.test.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class ItemDelay implements Delayed{
	
	private String itemName;
	
	public ItemDelay(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public int compareTo(Delayed o) {
		ItemDelay itemDelay = (ItemDelay)o;
		return itemDelay.itemName.compareTo(this.itemName);
		
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.toSeconds(30000);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemDelay [itemName=" + itemName + "]";
	}

}
