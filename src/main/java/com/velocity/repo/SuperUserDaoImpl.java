package com.velocity.repo;

import org.springframework.stereotype.Repository;

@Repository("Dao2")
public class SuperUserDaoImpl implements IUserDao {

	@Override
	public String findNameById(Integer id) {
		// TODO Auto-generated method stub
		return "Ram";
	}

}
