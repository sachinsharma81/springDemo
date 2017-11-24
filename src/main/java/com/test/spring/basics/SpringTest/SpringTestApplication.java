package com.test.spring.basics.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringTestApplication.class, args);
		
		BinarySearch bs = new BinarySearch(new QuickSortAlgo());
		int result = bs.itemSort(new int[] {1,9,5,3},7);
		
		System.out.println(result);
		
	}
}
