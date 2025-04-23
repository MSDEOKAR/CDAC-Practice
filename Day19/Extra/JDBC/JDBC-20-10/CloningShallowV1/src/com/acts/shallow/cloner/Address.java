package com.acts.shallow.cloner;

public class Address {
	private String line1;
	private String zip;
	
	public Address() {
		super();
	}

	public Address(String line1, String zip) {
		super();
		this.line1 = line1;
		this.zip = zip;
	}
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", zip=" + zip + "]";
	}
}
