package com.tca.entites;

public class Travel {

	Vehicle v;
	
   public Travel(Vehicle v)
   {
	   this.v=v;
   }
   
   public void journy()
   {
	   v.move();
   }
}
