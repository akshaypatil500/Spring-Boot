package com.tca;
@FunctionalInterface
interface I{
	
	public void display(int a) ;
	
}
public class BehaviourPassToMethod {
	
	public static void main(String[] args) {
		
		//I ob=(a)->System.out.println(a);
		
		Test t=new Test();
		t.show((a)->System.out.println(a));
		
		t.show((a)->System.out.println(a*50));

		
		
	}

	
}
