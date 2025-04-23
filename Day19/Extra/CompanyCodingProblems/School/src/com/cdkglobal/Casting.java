package com.cdkglobal;

class C{
	
}
class D extends C{
	
}

public class Casting {
	public static void main(String[] args) {
		C c1 = new C();
		D d1 = new D();
		
		c1 = d1;
		//d1 = c1;
		
		C c2 = new D();
		//D d2 = new C();
	}

}
