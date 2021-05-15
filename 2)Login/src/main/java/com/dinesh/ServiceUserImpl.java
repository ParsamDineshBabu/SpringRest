package com.dinesh;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dinesh.User;

@Service
public class ServiceUserImpl implements UserService {

	List<User> users;

	public ServiceUserImpl() {
		users = new ArrayList<>();
		users.add(new User("dinesh", "dinesh"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
