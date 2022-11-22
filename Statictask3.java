package com.task1;

public class Statictask3 
{
static int x=10;
public static void main(String[] args) 
{
	Statictask3 t1=new Statictask3();
	Statictask3 t2=new Statictask3();
	t1.x=20;
	System.out.print(x+" ");
	System.out.println(t2.x);
}
}