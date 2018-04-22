package cn.foreverking.services;

import cn.foreverking.dao.po.UserPO;

public interface IUserService {
	public UserPO getUserById(int userId);
}
