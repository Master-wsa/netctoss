package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.AdminDao;
import com.netctoss.entity.Admin;
import com.netctoss.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Resource
	private AdminDao adminDao;
	
	@Override
	public int addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		int i = adminDao.insertAdmin(admin);
		int j = adminDao.insertAdmrol(admin);
		int k = 0 ;
		if(i > 0 && j > 0){
			k = 1;
		}
		return k;
	}

	@Override
	public boolean updateAdminInfo(Admin admin) {
		// TODO Auto-generated method stub
		if(adminDao.updateAdminInfo(admin)>0){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public int updateInfoByAdmin(Admin admin) {
		// TODO Auto-generated method stub
		int i = adminDao.updateInfoByAdmin(admin);
		int j = adminDao.deleteAdmrol(admin);
		int k = adminDao.insertAdmrol(admin);
		int m = 0;
		if(i > 0 && j > 0 && k > 0){
			m = 1;
		}
		return m;
	}

	@Override
	public int updateResetPsw(List<Integer> listI) {
		// TODO Auto-generated method stub
		return adminDao.updateResetPsw(listI);
	}

	@Override
	public boolean updateAdminPsw(Admin admin) {
		// TODO Auto-generated method stub
		if(adminDao.updateAdminPsw(admin)>0){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public int updateImage(Admin admin){
		return adminDao.updateImage(admin);
	}

	@Override
	public int delAdmin(Admin admin) {
		// TODO Auto-generated method stub
		int i = adminDao.deleteAdmrol(admin);
		int j = adminDao.deleteAdmin(admin);
		int k = 0;
		if(i > 0 && j > 0){
			k = 1;
		}
		return k;
	}
	
	@Override
	public List<Admin> getAdminByRoleId(Admin admin){
		return adminDao.selectAdminByRoleId(admin);
	}
	
	@Override
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.login(admin);
	}

	@Override
	public Admin getAdminById(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.selectAdminById(admin);
	}


	@Override
	public List<Admin> getAllAdmins(Map<String,Object> map) {
		// TODO Auto-generated method stub
		int pageSize = 8;
		int currentPage = (Integer)map.get("currentPage");
		int start = (currentPage-1)*pageSize;
		map.put("start", start);
		map.put("pageSize",pageSize);
		List<Integer> listI = adminDao.selectAllAdmid(map);
		List<Admin> listA = adminDao.selectAllAdmins(listI);
		return listA;
	}


	@Override
	public int getAdminCount(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return adminDao.selectAdminCount(map);
	}


	@Override
	public Admin getAdminByAccount(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.selectAdminByAccount(admin);
	}

}
