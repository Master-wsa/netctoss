package com.netctoss.entity;

import java.sql.Date;

public class Fee {
	private int fee_id;			//资费ID
	private String fee_name;	//资费名称
	private int fee_type;		//资费类型（0包月，1套餐，2计时）
	private int fee_time;		//基本时长
	private double fee_bfee;	//基本费用
	private double fee_ufee;	//单位费用
	private Date fee_ctime;		//创建时间
	private Date fee_stime;		//开通时间
	private int fee_state;		//资费状态（0暂停，1启用，2删除）
	private String fee_des;		//资费说明
	private String b1;
	private String b2;
	private String b3;
	private String b4;
	private String field;		//字段名
	private String descOrAsc;	//升序or降序
	
	public Fee() {
		super();
	}
	
	public Fee(int fee_id) {
		super();
		this.fee_id = fee_id;
	}

	public Fee(int fee_id, String fee_name, int fee_type, int fee_time, double fee_bfee, double fee_ufee,
			Date fee_ctime, Date fee_stime, int fee_state, String fee_des, String b1, String b2, String b3, String b4) {
		super();
		this.fee_id = fee_id;
		this.fee_name = fee_name;
		this.fee_type = fee_type;
		this.fee_time = fee_time;
		this.fee_bfee = fee_bfee;
		this.fee_ufee = fee_ufee;
		this.fee_ctime = fee_ctime;
		this.fee_stime = fee_stime;
		this.fee_state = fee_state;
		this.fee_des = fee_des;
		this.b1 = b1;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
	}
	/**
	 * 获取资费ID
	 * @return the fee_id
	 */
	public int getFee_id() {
		return fee_id;
	}
	/**
	 * 设置资费ID
	 * @param fee_id the fee_id to set
	 */
	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}
	/**
	 * 获取资费名称
	 * @return the fee_name
	 */
	public String getFee_name() {
		return fee_name;
	}
	/**
	 * 设置资费名称
	 * @param fee_name the fee_name to set
	 */
	public void setFee_name(String fee_name) {
		this.fee_name = fee_name;
	}
	/**
	 * 获取资费类型（0包月，1套餐，2计时）
	 * @return the fee_type
	 */
	public int getFee_type() {
		return fee_type;
	}
	/**
	 * 设置资费类型（0包月，1套餐，2计时）
	 * @param fee_type the fee_type to set
	 */
	public void setFee_type(int fee_type) {
		this.fee_type = fee_type;
	}
	/**
	 * 获取基本时长
	 * @return the fee_time
	 */
	public int getFee_time() {
		return fee_time;
	}
	/**
	 * 设置基本时长
	 * @param fee_time the fee_time to set
	 */
	public void setFee_time(int fee_time) {
		this.fee_time = fee_time;
	}
	/**
	 * 获取基本费用
	 * @return the fee_bfee
	 */
	public double getFee_bfee() {
		return fee_bfee;
	}
	/**
	 * 设置基本费用
	 * @param fee_bfee the fee_bfee to set
	 */
	public void setFee_bfee(double fee_bfee) {
		this.fee_bfee = fee_bfee;
	}
	/**
	 * 获取单位费用
	 * @return the fee_ufee
	 */
	public double getFee_ufee() {
		return fee_ufee;
	}
	/**
	 * 设置单位费用
	 * @param fee_ufee the fee_ufee to set
	 */
	public void setFee_ufee(double fee_ufee) {
		this.fee_ufee = fee_ufee;
	}
	/**
	 * 获取创建时间
	 * @return the fee_ctime
	 */
	public Date getFee_ctime() {
		return fee_ctime;
	}
	/**
	 * 设置创建时间
	 * @param fee_ctime the fee_ctime to set
	 */
	public void setFee_ctime(Date fee_ctime) {
		this.fee_ctime = fee_ctime;
	}
	/**
	 * 获取开通时间
	 * @return the fee_stime
	 */
	public Date getFee_stime() {
		return fee_stime;
	}
	/**
	 * 设置开通时间
	 * @param fee_stime the fee_stime to set
	 */
	public void setFee_stime(Date fee_stime) {
		this.fee_stime = fee_stime;
	}
	/**
	 * 获取资费状态（0暂停，1启用，2删除）
	 * @return the fee_state
	 */
	public int getFee_state() {
		return fee_state;
	}
	/**
	 * 设置资费状态（0暂停，1启用，2删除）
	 * @param fee_state the fee_state to set
	 */
	public void setFee_state(int fee_state) {
		this.fee_state = fee_state;
	}
	/**
	 * 获取资费说明
	 * @return the fee_des
	 */
	public String getFee_des() {
		return fee_des;
	}
	/**
	 * 设置资费说明
	 * @param fee_des the fee_des to set
	 */
	public void setFee_des(String fee_des) {
		this.fee_des = fee_des;
	}
	/**
	 * @return the b1
	 */
	public String getB1() {
		return b1;
	}
	/**
	 * @param b1 the b1 to set
	 */
	public void setB1(String b1) {
		this.b1 = b1;
	}
	/**
	 * @return the b2
	 */
	public String getB2() {
		return b2;
	}
	/**
	 * @param b2 the b2 to set
	 */
	public void setB2(String b2) {
		this.b2 = b2;
	}
	/**
	 * @return the b3
	 */
	public String getB3() {
		return b3;
	}
	/**
	 * @param b3 the b3 to set
	 */
	public void setB3(String b3) {
		this.b3 = b3;
	}
	/**
	 * @return the b4
	 */
	public String getB4() {
		return b4;
	}
	/**
	 * @param b4 the b4 to set
	 */
	public void setB4(String b4) {
		this.b4 = b4;
	}
	/**
	 * 获取要排序的字段名
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * 设置要排序的字段名
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * 获取升序or降序
	 * @return the descOrAsc
	 */
	public String getDescOrAsc() {
		return descOrAsc;
	}
	/**
	 * 设置升序or降序
	 * @param descOrAsc the descOrAsc to set
	 */
	public void setDescOrAsc(String descOrAsc) {
		this.descOrAsc = descOrAsc;
	}
	
}
