package com.task1;

public class Statictask2 
{
int x=10;
public static void main(String[] args) 
{
System.out.println(Statictask2.x);	
}
static {
	int x=30;
	System.out.println(x+"");
}

}
//output:-compile time error