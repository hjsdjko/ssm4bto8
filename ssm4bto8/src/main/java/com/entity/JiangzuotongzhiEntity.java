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
 * 讲座通知
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
@TableName("jiangzuotongzhi")
public class JiangzuotongzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangzuotongzhiEntity() {
		
	}
	
	public JiangzuotongzhiEntity(T t) {
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
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 学分
	 */
					
	private String xuefen;
	
	/**
	 * 所属平台
	 */
					
	private String suoshupingtai;
	
	/**
	 * 课程时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date kechengshijian;
	
	/**
	 * 链接
	 */
					
	private String lianjie;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	
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
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
	/**
	 * 设置：学分
	 */
	public void setXuefen(String xuefen) {
		this.xuefen = xuefen;
	}
	/**
	 * 获取：学分
	 */
	public String getXuefen() {
		return xuefen;
	}
	/**
	 * 设置：所属平台
	 */
	public void setSuoshupingtai(String suoshupingtai) {
		this.suoshupingtai = suoshupingtai;
	}
	/**
	 * 获取：所属平台
	 */
	public String getSuoshupingtai() {
		return suoshupingtai;
	}
	/**
	 * 设置：课程时间
	 */
	public void setKechengshijian(Date kechengshijian) {
		this.kechengshijian = kechengshijian;
	}
	/**
	 * 获取：课程时间
	 */
	public Date getKechengshijian() {
		return kechengshijian;
	}
	/**
	 * 设置：链接
	 */
	public void setLianjie(String lianjie) {
		this.lianjie = lianjie;
	}
	/**
	 * 获取：链接
	 */
	public String getLianjie() {
		return lianjie;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}

}
