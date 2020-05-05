package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserModuleDao;
import com.app.model.User;
import com.app.service.IUserModuleService;
@Service
public class UserModuleService implements IUserModuleService {
@Autowired
	private IUserModuleDao dao;
	@Override
	@Transactional
	public Integer saveuser(User user) {
		// TODO Auto-generated method stub
		return dao.saveuser(user);
	}

	@Override
	@Transactional
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		dao.updateuser(user);
	}

	@Override
	@Transactional
	public void deleteuser(Integer user) {
		// TODO Auto-generated method stub
		dao.deleteuser(user);
	}

	@Override
	@Transactional(readOnly = true)
	public User getuserbyid(Integer userid) {
		// TODO Auto-generated method stub
		return dao.getuserbyid(userid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> getallusers() {
		// TODO Auto-generated method stub
		return dao.getallusers();
	}
}
