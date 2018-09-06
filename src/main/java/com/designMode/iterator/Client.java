package com.designMode.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		Iterator<Integer> iterator = aggregate.createIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		List<Integer> a = new ArrayList<Integer>();
	}
}
