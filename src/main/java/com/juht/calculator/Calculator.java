package com.juht.calculator;
import org.springframework.cache.annotation.Cacheable;
/** This is calcluator sevice class
    Hongtaek Ju
*/
@Service
public class Calculator {
	@Cacheable("sum")
	int sum(int a, int b){
		return a+b;
	}
	int dif(int a, int b){
		return a-b;
	}
}
