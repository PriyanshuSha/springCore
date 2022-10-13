package com.springCore;

public class school {
	private schoolClass Class;
	
	public schoolClass getSchCl() {
		return Class;
	}
       //dependency injection
	public void setSchCl(schoolClass schCl) {
		this.Class = schCl;
	}

	public void greeting() {
		
		System.out.println("welcome to school ");
		Class.classs();
	}

}
