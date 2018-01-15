package com.xy.controller;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xy.entity.User;
import com.xy.service.TestService;

@Controller
@RequestMapping("/test")

public class TestController {
   
	@Resource
	private TestService testService;
	@Resource
	private  RedisTemplate<String, Object> redisTemplate;
	
	@RequestMapping("/test")
	public void testController() {
    System.out.println(redisTemplate);
    User u = new User();
    u.setId(1);
    redisTemplate.opsForValue().set("a", "sssssssssssssssssss");
    redisTemplate.opsForValue().set("user", u);
    System.out.println(redisTemplate.opsForValue().get("a"));
    System.out.println(redisTemplate.opsForValue().get("user"));
    throw new RuntimeException("异常了");
		//  List list = testService.testService();
    //  System.out.println(list); 
   }
   
   
}
