package com.netctoss.dao;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Bill;

/**
 * 月账单dao
 * @author wdh
 *
 */
public interface BillDao {
	/**
	 * 条件查询bill
	 * @param bill
	 * @return
	 */
	public List<Bill> selectBillByCond(Map map);
	/**
	 * 查询条数
	 * @return
	 */
	public int selectBillCount(Map map);
	/**
	 * 自动统计item
	 * @return
	 */
	public int countItem();
}
