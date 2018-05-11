package cn.genomics.hg.common.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**   
 * @Description: 
 * @author wuyaohong  
 * @date 2018年5月11日 下午2:48:45 
 * @version V1.0   
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T>{

}
