package com.xy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xy.dao.TestDao;
import com.xy.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Resource
	private TestDao testDao;
		
	public List testService() {
		
     	List list =	testDao.testDao();
     	return list;
	}
	
	
	
}
