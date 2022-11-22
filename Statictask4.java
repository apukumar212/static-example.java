package com.task1;

public class Statictask4 
{
static int x=10;
static int y=20;
static 
{
	System.out.println("----Test SB1 Called----");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}
static void m1()
{
	int x=100;
	System.out.println("static method called");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}
public static void main(String[] args) 
{
m1();	
}
static 
{
	System.out.println("----Test SB2 called----");
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}
}
