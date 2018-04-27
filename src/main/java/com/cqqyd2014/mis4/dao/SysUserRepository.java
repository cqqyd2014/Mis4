package com.cqqyd2014.mis4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cqqyd2014.mis4.domain.SysUser;
import com.cqqyd2014.mis4.domain.SysUserId;

public interface SysUserRepository extends JpaRepository<SysUser, SysUserId>{
	SysUser findByUserLoginAndId_ComId(String userLogin,String com_id);
	
}
