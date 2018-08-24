package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestNumAnno {

	@PerformOperation(num1 = 45, num2 = 45)
	public static void someMethod() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestNumAnno test = new TestNumAnno();
		Class c = test.getClass();
		
		Method[] methods = c.getMethods();
		
		for(Method method: methods) {
			Annotation[] annotations = method.getAnnotations();
				
			for(Annotation anno : annotations) {
				if(anno.annotationType().equals(PerformOperation.class)) {
					PerformOperation m =(PerformOperation) anno;
					System.out.println(m.num1() + m.num2());
				}
			}
		}
	}

}

