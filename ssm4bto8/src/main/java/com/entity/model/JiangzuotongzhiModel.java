package com.entity.model;

import com.entity.JiangzuotongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 讲座通知
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public class JiangzuotongzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
