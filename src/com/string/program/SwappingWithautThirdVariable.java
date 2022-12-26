package com.string.program;

public class SwappingWithautThirdVariable {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;

System.out.println(a);
System.out.println(b);	

a=a+b;
b=a-b;
a=a-b;

System.out.println(a);
System.out.println(b);

String s1="Kalyani";
String s2="Anandi";

System.out.println(s1);
System.out.println(s2);

s1=s1+s2;

System.out.println(s1);//KalyaniAnandi

s2=s1.substring(0,s1.length()-s2.length());
System.out.println(s2);//Kalyani

s1=s1.substring(s2.length());
System.out.println(s1);

System.out.println("After swapping");
System.out.println(s1);
System.out.println(s2);
		
	}

}
