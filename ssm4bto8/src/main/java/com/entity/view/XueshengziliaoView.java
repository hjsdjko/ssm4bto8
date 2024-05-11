package com.entity.view;

import com.entity.XueshengziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
@TableName("xueshengziliao")
public class XueshengziliaoView  extends XueshengziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengziliaoView(){
	}
 
 	public XueshengziliaoView(XueshengziliaoEntity xueshengziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
