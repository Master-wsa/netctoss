package com.netctoss.service;

import java.util.List;
import java.util.Map;

import com.netctoss.entity.Fee;

public interface FeeService {

	/**
	 * 通过Fee_id查找资费信息
	 * @param fee_id
	 * @return
	 */
	public Fee getFeeById(Fee fee);
	/**
	 * 修改资费详细信息
	 * @param fee
	 * @return
	 */
	public boolean updFee(Fee fee);
	/**
	 * 通过Fee_id修改fee_state资费状态
	 * @param fee
	 * @return
	 */
	public boolean updFeeStateById(Fee fee); 
	/**
	 * 排序
	 * @param fee
	 * @return
	 */
	public List<Fee> getFeeSort(Map map);
	/**
	 * 添加资费
	 * @param fee
	 * @return
	 */
	public boolean addFee(Fee fee);
	/**
	 * 计算资费总数
	 * 
	 */
	 public int countFee();
	 
	 public boolean getFeeByName(Fee fee);
	 
	 public List<Fee> getAllFee();
}
