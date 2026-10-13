package com.tca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tca.entity.Employee;
import com.tca.service.EmployeeService;

@Controller
public class EmployeeController {

	   @Autowired
	   private EmployeeService employeeService;
	   
	   @Value("${app.custome.pageSize}")
	   private int pageSize;
	   
	   @GetMapping("/show")
	   public String showEmployee(@RequestParam(defaultValue = "0") int pageNumber , Model model) {
		   
		  
		   Page<Employee> page=employeeService.fetchAll(pageNumber,pageSize);
		   
		   model.addAttribute("emps", page);
		   model.addAttribute("pageContent", page.getContent());
		   model.addAttribute("currentPage", page.getNumber());
		   model.addAttribute("hasNext", page.hasNext());
		   model.addAttribute("hasPrevious", page.hasPrevious());

		   
		   return "list";
	   }
}
