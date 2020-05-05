package com.app.service;

import java.util.List;

import com.app.model.User;

public interface IUserModuleService 
{
	public Integer saveuser(User user);
	public void updateuser(User user);
	public void deleteuser(Integer user);
	public User getuserbyid(Integer userid);
	public List<User> getallusers();
}
