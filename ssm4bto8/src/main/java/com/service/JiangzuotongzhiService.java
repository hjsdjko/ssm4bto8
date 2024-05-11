package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangzuotongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangzuotongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangzuotongzhiView;


/**
 * 讲座通知
 *
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface JiangzuotongzhiService extends IService<JiangzuotongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangzuotongzhiVO> selectListVO(Wrapper<JiangzuotongzhiEntity> wrapper);
   	
   	JiangzuotongzhiVO selectVO(@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);
   	
   	List<JiangzuotongzhiView> selectListView(Wrapper<JiangzuotongzhiEntity> wrapper);
   	
   	JiangzuotongzhiView selectView(@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangzuotongzhiEntity> wrapper);
   	

}

