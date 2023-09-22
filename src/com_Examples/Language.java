package com_Examples;

public interface Language {
	public void name();          //class implementing interface
}
 class Locallanguage implements Language{

	@Override
	public void name() {
		System.out.println("local language is : Telugu ");
	}
	
}