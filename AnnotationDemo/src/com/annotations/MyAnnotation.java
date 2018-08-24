package com.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) // or @Retention(RetentionPolicy.RUNTME)    //the one on the left is possible because of static import
@Target(METHOD)     // OR @Target(ElementType.METHOD)
public @interface MyAnnotation {
	
	int value();

}
