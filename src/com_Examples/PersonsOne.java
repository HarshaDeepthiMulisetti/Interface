package com_Examples;

public interface PersonsOne {       //one class implementing multiple interfaces
	 public void   eat();
	 public void sleep();
	 public void read();
}
 interface PersonsTwo{
	 public void write();
	 public void  talk();
	 public void dance();
}
class Womens implements PersonsOne,PersonsTwo{

	@Override
	public void eat() {
		System.out.println("She is Eating....");
	}

	@Override
	public void sleep() {
		System.out.println("She is Sleeping....");
		
	}

	@Override
	public void read() {
		System.out.println("She is Reading....");
	}

	@Override
	public void write() {
		System.out.println("She is Writing.....");
		
	}

	@Override
	public void talk() {
		System.out.println("she is Talking....");
	}

	@Override
	public void dance() {
		System.out.println("she is Dancing....");
	}
}
