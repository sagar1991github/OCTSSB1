package com.velocity.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("Dao1")
@Primary
public class UserDaoImpl implements IUserDao {

	@Override
	public String findNameById(Integer id) {
		// TODO Auto-generated method stub
		return "Mohan";
	}

}
