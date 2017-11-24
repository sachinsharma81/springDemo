package com.test.spring.basics.SpringTest;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortAlgo{
	
	public int sort(int [] arr, int item) {
		System.out.println("####################################in BubbleSort class###########################");
		return item;
	}

}
