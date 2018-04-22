package cn.foreverking.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.foreverking.dao.UserPOMapper;
import cn.foreverking.dao.po.UserPO;
import cn.foreverking.services.IUserService;

public class UserService implements IUserService {

	@Autowired
	private UserPOMapper userPOMapper;

	@Override
	public UserPO getUserById(int userId) {
		return userPOMapper.selectByPrimaryKey(userId);
	}

}
