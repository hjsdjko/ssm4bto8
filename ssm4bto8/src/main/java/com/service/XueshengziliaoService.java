package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengziliaoView;


/**
 * 学生资料
 *
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface XueshengziliaoService extends IService<XueshengziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengziliaoVO> selectListVO(Wrapper<XueshengziliaoEntity> wrapper);
   	
   	XueshengziliaoVO selectVO(@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);
   	
   	List<XueshengziliaoView> selectListView(Wrapper<XueshengziliaoEntity> wrapper);
   	
   	XueshengziliaoView selectView(@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengziliaoEntity> wrapper);
   	

}

