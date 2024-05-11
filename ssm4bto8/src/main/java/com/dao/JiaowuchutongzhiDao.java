package com.dao;

import com.entity.JiaowuchutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaowuchutongzhiVO;
import com.entity.view.JiaowuchutongzhiView;


/**
 * 教务处通知
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface JiaowuchutongzhiDao extends BaseMapper<JiaowuchutongzhiEntity> {
	
	List<JiaowuchutongzhiVO> selectListVO(@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);
	
	JiaowuchutongzhiVO selectVO(@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);
	
	List<JiaowuchutongzhiView> selectListView(@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);

	List<JiaowuchutongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);
	
	JiaowuchutongzhiView selectView(@Param("ew") Wrapper<JiaowuchutongzhiEntity> wrapper);
	

}
