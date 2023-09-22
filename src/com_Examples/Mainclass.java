package com_Examples;

public class Mainclass {

	public static void main(String[] args) {
		Womens obj=new Womens();
		obj.eat();
		obj.sleep();
		obj.read();
		obj.dance();                                  //class Womens implements interfaces PersonsOne,PersonsTwo
		obj.write();
		obj.talk();
		System.out.println("______________");
		Locallanguage obj1=new Locallanguage();      //class Locallanguage implements Language
		obj1.name();
		System.out.println("_______________");
		Games obj2=new Games();
		obj2.menteamplayers();
		obj2.teammembers();
		obj2.teamScore();                       //interface can extending other interface and  calss games implementing other interfaces
		obj2.players();
		obj2.totalsports();
		obj2.Womenteamplayers();
		obj2.goalscore();
		System.out.println("________________");
		// create an object of Rectangle
	    Rectangle r1 = new Rectangle();
	    r1.getArea();
	    r1.getSides();

	    // create an object of Square
	    Square s1 = new Square();
	    s1.getArea();
	    s1.getSides();
	}

}
