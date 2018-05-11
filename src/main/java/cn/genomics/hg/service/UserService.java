package cn.genomics.hg.service;

import java.util.List;

import cn.genomics.hg.dto.User;

/**   
 * @Description: 用户接口
 * @author wuyaohong  
 * @date 2018年5月10日 下午5:47:47 
 * @version V1.0   
 */
public interface UserService {
	
	int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

}
