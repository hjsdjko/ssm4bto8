package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjiheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjiheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjiheView;


/**
 * 学生集合
 *
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface XueshengjiheService extends IService<XueshengjiheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjiheVO> selectListVO(Wrapper<XueshengjiheEntity> wrapper);
   	
   	XueshengjiheVO selectVO(@Param("ew") Wrapper<XueshengjiheEntity> wrapper);
   	
   	List<XueshengjiheView> selectListView(Wrapper<XueshengjiheEntity> wrapper);
   	
   	XueshengjiheView selectView(@Param("ew") Wrapper<XueshengjiheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjiheEntity> wrapper);
   	

}

