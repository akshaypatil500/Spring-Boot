package com.tca;

import java.util.HashMap;
import java.util.Scanner;

import com.tca.bean.Student;

public class App {
	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();

		hm.put("SB-1", new Student("Sachin", "Pune", 78));
		hm.put("SB-2", new Student("Akshay", "Jalgaon", 81));
		hm.put("SB-3", new Student("ram", "Pune", 45));
		hm.put("SB-4", new Student("Abhi", "Nagar", 71));
		hm.put("SB-5", new Student("Sanchit", "Jamner", 87));

		for (Student s : hm.values()) {
			System.out.println(s);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id To Fetch Data ");
		String id = sc.next();

		Student s = hm.get(id);

		if (s != null) {
			System.out.println(s);
		} else {
			System.out.println("Not Found");
		}

	}
}
