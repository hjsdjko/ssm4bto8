package com.dao;

import com.entity.DaibanshixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaibanshixiangVO;
import com.entity.view.DaibanshixiangView;


/**
 * 待办事项
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface DaibanshixiangDao extends BaseMapper<DaibanshixiangEntity> {
	
	List<DaibanshixiangVO> selectListVO(@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);
	
	DaibanshixiangVO selectVO(@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);
	
	List<DaibanshixiangView> selectListView(@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);

	List<DaibanshixiangView> selectListView(Pagination page,@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);
	
	DaibanshixiangView selectView(@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);
	

}
