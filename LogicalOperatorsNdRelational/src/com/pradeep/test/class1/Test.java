package com.pradeep.test.class1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!!!");
		
		float[] vals = new float[3];
		vals[0] = 14.5f;
		vals[1] = 10.3f;
		vals[2] = 12.3f;
		float x = 0.0f;
		
		for(int i = 0; i< vals.length; i++)
		{
			
			x = x + vals[i];
			
		}
		System.out.println(x);
	}

}
