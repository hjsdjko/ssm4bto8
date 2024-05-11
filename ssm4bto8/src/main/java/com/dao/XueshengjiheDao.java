package com.dao;

import com.entity.XueshengjiheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjiheVO;
import com.entity.view.XueshengjiheView;


/**
 * 学生集合
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface XueshengjiheDao extends BaseMapper<XueshengjiheEntity> {
	
	List<XueshengjiheVO> selectListVO(@Param("ew") Wrapper<XueshengjiheEntity> wrapper);
	
	XueshengjiheVO selectVO(@Param("ew") Wrapper<XueshengjiheEntity> wrapper);
	
	List<XueshengjiheView> selectListView(@Param("ew") Wrapper<XueshengjiheEntity> wrapper);

	List<XueshengjiheView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjiheEntity> wrapper);
	
	XueshengjiheView selectView(@Param("ew") Wrapper<XueshengjiheEntity> wrapper);
	

}
