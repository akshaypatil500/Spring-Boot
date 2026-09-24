package com.tca;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public class Demo {

	public static void main(String[] args) {

		
      for(Gender g:Gender.values())
      {
    	    System.out.println(g.getValue());
    	    System.out.println(g.getCode());
      }
		
		
		
	}

}
