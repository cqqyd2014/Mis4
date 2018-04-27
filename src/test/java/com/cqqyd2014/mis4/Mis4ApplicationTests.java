package com.cqqyd2014.mis4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqqyd2014.mis4.dao.SysUserRepository;
import com.cqqyd2014.mis4.domain.SysUser;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Mis4ApplicationTests {
	@Autowired
	private SysUserRepository sysUserRepository;


	@Test
	public void contextLoads() {
		SysUser su=sysUserRepository.findByUserLoginAndId_ComId("wam","CQQY");
		System.out.println(su.getName());
		
		
		
	}

}
