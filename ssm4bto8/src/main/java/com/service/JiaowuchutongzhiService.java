package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaowuchutongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaowuchutongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowuchutongzhiView;


/**
 * 教务处通知
 *
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface JiaowuchutongzhiService extends IService<JiaowuchutongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaowuchutongzhiVO> selectListVO(Wrapper<JiaowuchutongzhiEntity> wrapper);
   	
   	JiaowuchutongzhiVO selectVO(@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);
   	
   	List<JiaowuchutongzhiView> selectListView(Wrapper<JiaowuchutongzhiEntity> wrapper);
   	
   	JiaowuchutongzhiView selectView(@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaowuchutongzhiEntity> wrapper);
   	

}

