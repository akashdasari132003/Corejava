// smaller is converted into larger is called implicit 
// larger is not converted into smaller is called explicit



package com.practise;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		short x = 10; // 2 bytes source code is smaller 
		// implicit coversion 
		//int y = (int)x;
		
		int y = x; // 4 bytes destination code is larger 
		System.out.println(y);
		
		double a = 7.08980029;// Source code has 8 bytes larger data
		// explicit conversion
		
		int b = (int)a;// destinaton has 4 bytes smaller data
		System.out.println(b);

	}

}
