package com.cdkglobal;

public class SelfReference {

	//SelfReference ref = new SelfReference();
	static SelfReference ref = new SelfReference();
	
	public int show(){
		return (true? null: 0);
	}
	
	public static void main(String[] args) {
		SelfReference ref1 = new SelfReference();
		ref1.show();
		
	}
}
