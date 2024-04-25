package com.jsp.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/insert")
	public ModelAndView getEmployee() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("employee", new Employee());
	  mv.setViewName("create.jsp");
		return mv;
		
	}
	@RequestMapping("/save")
	
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		dao.saveEmployee(employee);
		ModelAndView v= new ModelAndView();
	   v.setViewName("index.jsp");
	   return v;
		
	}
	
	//api for search the object
	@RequestMapping("/search")
	public ModelAndView searchEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("get.jsp");
		return mv;	
		
	}
	
	@RequestMapping("/display")
	public ModelAndView findEmployee(@ModelAttribute Employee employee) {
		ModelAndView mv=new ModelAndView();
	Employee emp=dao.getEmployeeById(employee.getId());
		mv.addObject("employee", emp);
		mv.setViewName("display.jsp");
		return mv;
		
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("delete.jsp");
		return mv;
		
	}
	@RequestMapping("/remove")
	public String removeEmployee(@ModelAttribute  Employee employee) {
		dao.deleteEmploye(employee.getId());
		return "Employee detlis delete successfully";
	}
	
	@RequestMapping("/displayall")
	public ModelAndView getAllEmployee() {
		ModelAndView mv=new ModelAndView();
	List<Employee>employee=dao.getAllEmployee();
	mv.addObject("employeelist", employee);
	mv.setViewName("displayall.jsp");
	return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateEmployee() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee", new Employee());
		mv.setViewName("update.jsp");
		return mv;
		
	}
	@RequestMapping("/modify")
	public String modifyEmployeDetiles(@ModelAttribute Employee employee) {
		dao.updateEmployee(employee);
		return "EMPLOYEE DETILES UPADATE SUCCESSFULLY";
	}
}
