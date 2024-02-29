package com.in28min.spring.basics.springin5steps;	
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplicationBasicApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringIn5StepsApplicationBasicApplication.class, args);
		binarySearchImpl binarySearch=context.getBean(binarySearchImpl.class);
		binarySearchImpl binarySearch1=context.getBean(binarySearchImpl.class);
		binarySearch.binarySearch(new int[] {1,2,3,4},1);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
	}	

}
