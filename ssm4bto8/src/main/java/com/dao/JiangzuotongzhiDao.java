package com.dao;

import com.entity.JiangzuotongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangzuotongzhiVO;
import com.entity.view.JiangzuotongzhiView;


/**
 * 讲座通知
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface JiangzuotongzhiDao extends BaseMapper<JiangzuotongzhiEntity> {
	
	List<JiangzuotongzhiVO> selectListVO(@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);
	
	JiangzuotongzhiVO selectVO(@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);
	
	List<JiangzuotongzhiView> selectListView(@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);

	List<JiangzuotongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);
	
	JiangzuotongzhiView selectView(@Param("ew") Wrapper<JiangzuotongzhiEntity> wrapper);
	

}
