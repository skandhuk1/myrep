package com;

public class ComputerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer.Builder("2GB", "2TB", "intel i7").build();
		
		Computer comp1 = new Computer.Builder("2GB", "2TB", "intel i7").setGraphicsCardEnabled(true).build();
	}

}
