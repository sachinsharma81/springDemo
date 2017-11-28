package com.test.spring.basics.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {

	@Autowired
	@Qualifier("quick")
	//private SortAlgo quickSortAlgo;
	private SortAlgo sortAlgo;
	
	
	
	/* Autowired by name 
	 * If any dependency does not have @Primary, running application will give error
	 * but if we use SortAlgo reference as bubbleSortAlgo or quickSortAlgo 
	 * Application will run.
	 * use bubbleSortAlgo or quickSortAlgo to call method itemSort. 
	 * 
	 * by Name vs @Primary
	 * @Primary has preference if we use quickSortAlgo and @Primary in BubbleSortAlgo class
	 * */
	

	// public BinarySearch(SortAlgo salgo) {
	// super();
	// this.salgo = salgo;
	// }

	// public void setSalgo(SortAlgo salgo) {
	// this.salgo = salgo;
	// }

	// no need to have a constructor or setter to initialize SortAlo

	public int itemSort(int[] arr, int itemS) {

		//return quickSortAlgo.sort(arr, itemS);
		return sortAlgo.sort(arr, itemS);
	}

}
