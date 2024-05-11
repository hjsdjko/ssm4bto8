package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QitatongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QitatongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QitatongzhiView;


/**
 * 其他通知
 *
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface QitatongzhiService extends IService<QitatongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QitatongzhiVO> selectListVO(Wrapper<QitatongzhiEntity> wrapper);
   	
   	QitatongzhiVO selectVO(@Param("ew") Wrapper<QitatongzhiEntity> wrapper);
   	
   	List<QitatongzhiView> selectListView(Wrapper<QitatongzhiEntity> wrapper);
   	
   	QitatongzhiView selectView(@Param("ew") Wrapper<QitatongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QitatongzhiEntity> wrapper);
   	

}

