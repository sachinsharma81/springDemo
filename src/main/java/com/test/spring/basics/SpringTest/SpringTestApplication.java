package com.test.spring.basics.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		
		ApplicationContext appcon = SpringApplication.run(SpringTestApplication.class, args);
		BinarySearch bs = appcon.getBean(BinarySearch.class);
		
		// BinarySearch bs = new BinarySearch(new QuickSortAlgo());
		
		int result = bs.itemSort(new int[] {1,9,5,3},7);
		System.out.println(result);
		
		
	}
}
