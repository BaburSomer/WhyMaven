package com.bilgeadam.boost.course02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyClass {
	private String str1;
	private String str2;
	private int    int1;
	private int    int2;
	private double double1;
	
	public String getStr1() {
		return this.str1 + "lkjjkjkjkl";
	}
}
