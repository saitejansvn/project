package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface IUserModuleDao 
{

	public Integer saveuser(User user);
	public void updateuser(User user);
	public void deleteuser(Integer user);
	public User getuserbyid(Integer userid);
	public List<User> getallusers();
}
