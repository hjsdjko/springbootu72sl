package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 测试数据
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-19 21:46:13
 */
@TableName("ceshishuju")
public class CeshishujuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshishujuEntity() {
		
	}
	
	public CeshishujuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 测试编号
	 */
					
	private String ceshibianhao;
	
	/**
	 * 测试名称
	 */
					
	private String ceshimingcheng;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 回答1
	 */
					
	private String huida1;
	
	/**
	 * 回答2
	 */
					
	private String huida2;
	
	/**
	 * 回答3
	 */
					
	private String huida3;
	
	/**
	 * 回答4
	 */
					
	private String huida4;
	
	/**
	 * 回答5
	 */
					
	private String huida5;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：测试编号
	 */
	public void setCeshibianhao(String ceshibianhao) {
		this.ceshibianhao = ceshibianhao;
	}
	/**
	 * 获取：测试编号
	 */
	public String getCeshibianhao() {
		return ceshibianhao;
	}
	/**
	 * 设置：测试名称
	 */
	public void setCeshimingcheng(String ceshimingcheng) {
		this.ceshimingcheng = ceshimingcheng;
	}
	/**
	 * 获取：测试名称
	 */
	public String getCeshimingcheng() {
		return ceshimingcheng;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：回答1
	 */
	public void setHuida1(String huida1) {
		this.huida1 = huida1;
	}
	/**
	 * 获取：回答1
	 */
	public String getHuida1() {
		return huida1;
	}
	/**
	 * 设置：回答2
	 */
	public void setHuida2(String huida2) {
		this.huida2 = huida2;
	}
	/**
	 * 获取：回答2
	 */
	public String getHuida2() {
		return huida2;
	}
	/**
	 * 设置：回答3
	 */
	public void setHuida3(String huida3) {
		this.huida3 = huida3;
	}
	/**
	 * 获取：回答3
	 */
	public String getHuida3() {
		return huida3;
	}
	/**
	 * 设置：回答4
	 */
	public void setHuida4(String huida4) {
		this.huida4 = huida4;
	}
	/**
	 * 获取：回答4
	 */
	public String getHuida4() {
		return huida4;
	}
	/**
	 * 设置：回答5
	 */
	public void setHuida5(String huida5) {
		this.huida5 = huida5;
	}
	/**
	 * 获取：回答5
	 */
	public String getHuida5() {
		return huida5;
	}

}
