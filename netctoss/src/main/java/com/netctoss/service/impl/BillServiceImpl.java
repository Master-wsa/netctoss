package com.netctoss.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.dao.BillDao;
import com.netctoss.entity.Bill;
import com.netctoss.service.BillService;
/**
 * 月账单service实现类
 * @author Administrator
 *
 */
@Service("billService")
public class BillServiceImpl implements BillService {
	@Resource
	private BillDao billDao;

	@Override
	public List<Bill> getBillByCond(Map map) {
		// TODO Auto-generated method stub
		return billDao.selectBillByCond(map);
	}

	@Override
	public int getBillCount(Map map) {
		// TODO Auto-generated method stub
		return billDao.selectBillCount(map);
	}

	@Override
	public boolean countItem() {
		// TODO Auto-generated method stub
		if(billDao.countItem()>0){
			return true;
		}
		return false;
	}

}
