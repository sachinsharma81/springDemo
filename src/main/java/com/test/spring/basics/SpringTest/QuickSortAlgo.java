package com.test.spring.basics.SpringTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")

public class QuickSortAlgo implements SortAlgo {

	public int sort(int[] arr, int item) {

		System.out.println("#######################in quicksort class###################");
		return item;
	}

}
