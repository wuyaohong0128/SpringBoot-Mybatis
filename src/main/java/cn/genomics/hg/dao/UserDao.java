package cn.genomics.hg.dao;

import java.util.List;

import cn.genomics.hg.dto.User;

public interface UserDao{
	

    int insert(User record);

    List<User> selectAllUser();
}