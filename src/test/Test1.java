package test;

import selenium.Test3;

public class Test1 {
	
	static Test1 t1= new Test1();
	//static Test2 t2= new Test2();
	static Test2 t2= new Test2(5); // constructor calling
	//ClassName ObjName = new ClassName();
	

	public static void main(String[] args) {
		
		//Test1 t1= new Test1();
		//Test2 t2= new Test2();
		 
		System.out.println("Hello");
		printMe();
		t1.scanMe();
		
		Test2.testing1(); // calling static method from another class
		t2.testing2(); // calling non-static method using object
		
		int x=t1.sum();
		System.out.println(x);
		
		int y =t1.sum(4,5);
		System.out.println(y);
		
		int z= t1.sum(10,11);
		System.out.println(z);
		
		Test3.testing3(); // call the class from different package using import package
				
	}
	
	public static void printMe()
	{
		System.out.println("I am in printme method");
	}

	public void scanMe()
	{
		System.out.println("I am in scanMe Method");
		// void means return type
	}
	
	public int sum()
	{
		int a = 2+3;
		return a;
	}
	
	public int sum(int b, int c)
	{
		int d= b+c;
		return d;
		
	}
}
