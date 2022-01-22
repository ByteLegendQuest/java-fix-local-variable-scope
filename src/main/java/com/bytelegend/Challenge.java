package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(relation(1, 2));
        System.out.println(relation(2, 1));
        System.out.println(relation(2, 2));
    }

    // Fix the compilation error
    // Return "a<b" if a < b, "a>b" if a > b, "a=b" otherwise
    public static String relation(int a, int b) {
		 String sign = "";
		String a1 = "";
		String b1 = "";
        if (a > b) {
            sign = ">";
        } else if (a < b) {
            sign = "<";
        } else {
            sign = "=";
        }
	
		a1 = a+"";
		b1 = b+"";
		return  a1+sign+b1 ;

    }
}
