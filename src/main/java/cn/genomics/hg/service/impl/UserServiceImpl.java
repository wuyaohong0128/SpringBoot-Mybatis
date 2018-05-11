package cn.genomics.hg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.genomics.hg.dao.UserDao;
import cn.genomics.hg.dto.User;
import cn.genomics.hg.service.UserService;

/**   
 * @Description: 用户接口实现类
 * @author wuyaohong  
 * @date 2018年5月10日 下午5:47:58 
 * @version V1.0   
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDao userDao;

	/* (non-Javadoc)
	 * @see cn.genomics.hg.service.UserService#addUser(cn.genomics.hg.dto.TUser)
	 */
	@Override
	public int addUser(User user) {
		return userDao.insert(user);
	}

	/* (non-Javadoc)
	 * @see cn.genomics.hg.service.UserService#findAllUser(int, int)
	 */
	@Override
	public List<User> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return userDao.selectAllUser();
	}

}
