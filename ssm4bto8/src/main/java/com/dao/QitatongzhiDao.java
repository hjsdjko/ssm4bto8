package com.dao;

import com.entity.QitatongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QitatongzhiVO;
import com.entity.view.QitatongzhiView;


/**
 * 其他通知
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface QitatongzhiDao extends BaseMapper<QitatongzhiEntity> {
	
	List<QitatongzhiVO> selectListVO(@Param("ew") Wrapper<QitatongzhiEntity> wrapper);
	
	QitatongzhiVO selectVO(@Param("ew") Wrapper<QitatongzhiEntity> wrapper);
	
	List<QitatongzhiView> selectListView(@Param("ew") Wrapper<QitatongzhiEntity> wrapper);

	List<QitatongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<QitatongzhiEntity> wrapper);
	
	QitatongzhiView selectView(@Param("ew") Wrapper<QitatongzhiEntity> wrapper);
	

}
