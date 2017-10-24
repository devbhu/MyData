package com.test.implement.hashtable;

import java.util.Map;

public class MyOwnHashTable {

	Entry[] table;
	int initialCapacity;
	double loadFactor;
	int threshold;
	private static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
	boolean alternateHashFunction;
	int size;

	public MyOwnHashTable() {
		initialCapacity = 11;
		loadFactor = 0.75;
		threshold = (int) Math.min(initialCapacity * loadFactor,
				MAX_ARRAY_LENGTH + 1);
		table = new Entry[initialCapacity];
	}

	public synchronized Object put(Object key, Object value) {
		if (key == null) {
			throw new NullPointerException();
		}
		if (key instanceof Integer && (Integer) key < 0) {
			throw new IllegalArgumentException();
		}
		int hash = hash(key);
		int index = (hash & 0X7FFFFFFF) % table.length;
		Entry e = table[index];
		for (; e != null;) {

			if (key.hashCode() == e.getKey().hashCode()
					&& key.equals(e.getKey())) {

				Object oldValue = e.value;

				e.value = value;

				return oldValue;
			}

			e = e.next;
		}

		e = table[index];

		table[index] = new Entry(key, value, e);

		size++;

		return null;
	}

	private void reHash() {

		if (size >= threshold && size < MAX_ARRAY_LENGTH) {

			initialCapacity = initialCapacity << 1 + 1;

		} else if (size >= MAX_ARRAY_LENGTH) {

			return;

		}

		threshold = (int) Math.min(initialCapacity * loadFactor,
				MAX_ARRAY_LENGTH - 1);
		Entry newTable[] = new Entry[initialCapacity];
		table = newTable;
		Entry e = null;
		for (int i = 0; i < table.length; i++) {
			for (e = table[i]; e != null;) {

				int hash = hash(e.getKey());

				int index = (hash & 0X7FFFFFFF) % newTable.length;

				e.next = newTable[index];

				newTable[index] = e;
				
				e = e.next;

			}

		}
	}

	public synchronized Object get(Object key) {

		int hash = hash(key);

		int index = (hash & 0X7FFFFFFF) % table.length;

		Entry e = table[index];

		for (; e != null;) {

			if (key.hashCode() == e.getKey().hashCode()
					&& key.equals(e.getKey())) {

				return e.value;
			}

			e = e.next;

		}

		return null;

	}

	public synchronized void remove(Object key) {

		int hash = hash(key);

		int index = (hash & 0X7FFFFFFF) % table.length;

		Entry e = table[index];
		Entry prev = null;

		for (; e != null;) {

			if (key.hashCode() == e.getKey().hashCode()
					&& key.equals(e.getKey())) {

				if (prev != null) {

					prev.next = e.next;
					e = prev;

				} else {
					Entry temp = e.next;

					e = null;

					e = temp;

				}

				size--;

				break;

			}

			prev = e;

			e = e.next;

		}

	}

	private int hash(Object key) {
		int hashCode = 0;
		if (alternateHashFunction) {

		} else {
			hashCode = key.hashCode();
		}
		return hashCode;
	}

	private static class Entry implements Map.Entry {

		Object key;

		Object value;

		Entry next;

		public Entry(Object key, Object value, Entry next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}

		@Override
		public Object getKey() {
			return key;
		}

		@Override
		public Object getValue() {

			return value;
		}

		@Override
		public Object setValue(Object value) {
			return null;
		}

		@Override
		public boolean equals(Object obj) {
			Entry passedKey = (Entry) obj;
			return (key.equals(passedKey)
					&& key.hashCode() == passedKey.getKey().hashCode()
					&& value != null && value.equals(passedKey.getValue()));
		}

		@Override
		public int hashCode() {

			if (value != null)
				return key.hashCode() ^ value.hashCode();

			return 0;
		}

	}

}
