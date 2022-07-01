package com.bilgeadam.boost.course02;

import org.apache.commons.lang3.StringUtils;

public class TestMyClass {

	public static void main(String[] args) {
		
		MyClass mC = new MyClass("ryt", "yyıuyıuy", 10, 20, 0.0);
		System.out.println(mC);
		mC.setStr1("AAAAAAAAAAAAAAAA");
		System.out.println(mC.getStr1());
		
		MyClass mC2 = new MyClass();
		
		String x = "ABC";
		x="VBN";
	}
}
