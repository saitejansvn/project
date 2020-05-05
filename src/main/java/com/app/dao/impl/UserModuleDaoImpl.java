package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserModuleDao;
import com.app.model.User;
@Repository
public class UserModuleDaoImpl implements IUserModuleDao{
@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveuser(User user) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(user);
	}

	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		ht.update(user);
	}

	@Override
	public void deleteuser(Integer user) {
		// TODO Auto-generated method stub
		ht.delete(new User());
	}

	@Override
	public User getuserbyid(Integer userid) {
		// TODO Auto-generated method stub
		return ht.get(User.class,userid);
	}

	@Override
	public List<User> getallusers() {
		// TODO Auto-generated method stub
		return ht.loadAll(User.class);
	}

}
