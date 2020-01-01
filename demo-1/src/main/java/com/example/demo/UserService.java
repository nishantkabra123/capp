package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private HibRepo userRepository;


//	public UserService(HibRepo userRepository) {
//		this.userRepository=userRepository;
//	}
	public String hello() {
		return "hello world";
	}

	public void saveMyUser(UserInfo user ) {
		UserInfo user1=new UserInfo();
		user1.setUid(675);
		user1.setUname("luffy");
		userRepository.save(user,user1);
	}
	public void saveMyCar(Car car ) {
		userRepository.save(car);
	}

	public List<UserInfo> showAllUsers(){
		List<UserInfo> users = new ArrayList<>();
		for(UserInfo user : userRepository.getAllUsers()) {
			users.add(user);
		}

		return users;
	}



}
