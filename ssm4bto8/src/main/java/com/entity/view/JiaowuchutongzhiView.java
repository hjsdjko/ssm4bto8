package com.entity.view;

import com.entity.JiaowuchutongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教务处通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
@TableName("jiaowuchutongzhi")
public class JiaowuchutongzhiView  extends JiaowuchutongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaowuchutongzhiView(){
	}
 
 	public JiaowuchutongzhiView(JiaowuchutongzhiEntity jiaowuchutongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaowuchutongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
