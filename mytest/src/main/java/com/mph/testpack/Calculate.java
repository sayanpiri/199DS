package com.mph.testpack;
public class Calculate {
	
	public int add(int... number) {
		int result =0;
			for(int i: number)
			{
				result +=i;
			}		
		return result;
	}
	public int multiply(int... number) {
		int result =1;
			for(int i: number)
			{
				result *=i;
			}		
		return result;
	}
	public int sum(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(25,35));
		System.out.println(c.add(10,20,35,45));
		System.out.println(c.add(40,50,16));
		System.out.println(c.multiply(41,51));
	}
	
	}

