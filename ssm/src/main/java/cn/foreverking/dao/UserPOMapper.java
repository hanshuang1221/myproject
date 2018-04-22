package cn.foreverking.dao;

import cn.foreverking.dao.po.UserPO;

public interface UserPOMapper {
	int deleteByPrimaryKey(Integer userId);

	int insert(UserPO record);

	int insertSelective(UserPO record);

	UserPO selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(UserPO record);

	int updateByPrimaryKey(UserPO record);
}
