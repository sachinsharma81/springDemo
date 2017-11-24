package com.test.spring.basics.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private SortAlgo salgo;

	public BinarySearch(SortAlgo salgo) {
		super();
		this.salgo = salgo;
	}
	
	public int itemSort(int[] arr, int itemS) {
		
		return salgo.sort(arr, itemS);
	}


}
