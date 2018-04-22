package cn.foreverking.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.foreverking.dao.UserPOMapper;
import cn.foreverking.dao.po.UserPO;
import cn.foreverking.services.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserPOMapper userDao;

	public UserPO getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}