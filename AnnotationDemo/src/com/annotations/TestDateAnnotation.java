package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestDateAnnotation {

	@MyDate(day = 13, month = "aug")
	public static void Display() {
		System.out.println("Displayy");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDateAnnotation test = new TestDateAnnotation();
		Class c = test.getClass();
		
		Method[] methods = c.getMethods();
		
		for(Method method: methods) {
			Annotation[] annotations = method.getAnnotations();
				
			for(Annotation anno : annotations) {
				if(anno.annotationType().equals(MyDate.class)) {
					MyDate m =(MyDate) anno;
					int day = m.day();
					System.out.println(day);
				}
			}
		}
	}

}
