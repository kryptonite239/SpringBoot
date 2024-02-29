package com.in28min.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class binarySearchImpl {
	@Autowired	
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	
	public int binarySearch(int[] numbers,int number) {
		
		System.out.println(sortAlgorithm);
		return 3;
		}
}
