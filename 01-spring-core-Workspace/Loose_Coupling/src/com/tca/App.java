package com.tca;

import com.tca.entites.Car;
import com.tca.entites.Travel;

public class App {

	public static void main(String[] args) {

        Travel t=new Travel(new Car());
        
        t.journy();
	}

}
