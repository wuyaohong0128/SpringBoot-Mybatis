package cn.genomics.hg.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.genomics.hg.dto.User;
import cn.genomics.hg.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @Description: 控制
 * @author wuyaohong
 * @date 2018年5月10日 下午5:39:49
 * @version V1.0
 */
@RestController
@Api(description = "【springboot-mybatis-demo接口API】")
public class UserContrroller {
	
	final static Logger log = LoggerFactory.getLogger(UserContrroller.class);
	
	
	@Autowired
    private UserService userService;
	
	@ApiOperation("保存用户")
	@ResponseBody
	@PostMapping(value = "/user/add", produces = { "application/json;charset=UTF-8" })
	public int addUser(@RequestBody @ApiParam(name="用户类",value="传入json格式",required=true) User user) {
		log.info("------------------测试 info-------------------");
		return userService.addUser(user);
	}
	
	@ApiOperation("获取用户列表")
	@ResponseBody
	@GetMapping(value = "/user/all/{pageNum}/{pageSize}", produces = { "application/json;charset=UTF-8" })
	public Object findAllUser(
		@ApiParam(required = true, value = "页码") @RequestParam(value = "pageNum")  int pageNum, 
		@ApiParam(required = true, value = "条数") @RequestParam(value = "pageSize")  int pageSize) {
		return userService.findAllUser(pageNum, pageSize);
	}
}
