package com.in28minutes.generics;

import java.util.ArrayList;

//                        T extends Number : int, long 등 숫자 타입만 가능해짐. String 불가
public class MyCustomList<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		return list.get(index);
	}
}
