package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@Autowired
	UserService userService;
	@ResponseBody
	@RequestMapping(value = "/home/{value}")
	public String test(@PathVariable(name = "value")String value,@RequestParam(name = "username" ) String name,@RequestParam(name = "age" ) String age) {
		return value+" "+age+" "+name+userService.hello();
	}
	//@ResponseBody
	@RequestMapping("/home")
	public String check(HttpSession session,Model m) {
		session.setAttribute("name", "nishant");
		UserInfo info =new UserInfo();
		info.setUname("James Bond");
		m.addAttribute("item",info);
		m.addAttribute("itemName", "samsung note 10");
		return "check";
	}
	
	@GetMapping("/users")
	public String showAllUsers(HttpServletRequest request,Model m) {
		request.setAttribute("users", userService.showAllUsers());		
		return "test";
	}
	@GetMapping("/save")
	public String saveUser() {
		UserInfo user =new UserInfo();
		
//		List<UserInfo> users=new ArrayList<>();
//		List<Car>cars=new ArrayList<>();
//		users.add(user);
//		users.add(user1);		
//		//user1.setCars(cars);			
//		//user.setCars(cars);
//		Car car=new Car();
//		car.setCid(604);
//		car.setCname("rolls royce");
//		//car.setUser(users);
//		//car.setUser(user);
//		Car car1=new Car();
//		car1.setCid(605);
//		car1.setCname("lamborghini");
//		//car1.setUser(users);
//		//car1.setUser(user);		
//		cars.add(car);
//		cars.add(car1);
		//user.setCars(cars);
		user.setUid(6787);
		user.setUname("zoro");
		userService.saveMyUser(user);
		//userService.saveMyUser(user1);
		
		
		return "test";	
	}
}


