package com.dao;

import com.entity.XueshengziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengziliaoVO;
import com.entity.view.XueshengziliaoView;


/**
 * 学生资料
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface XueshengziliaoDao extends BaseMapper<XueshengziliaoEntity> {
	
	List<XueshengziliaoVO> selectListVO(@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);
	
	XueshengziliaoVO selectVO(@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);
	
	List<XueshengziliaoView> selectListView(@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);

	List<XueshengziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);
	
	XueshengziliaoView selectView(@Param("ew") Wrapper<XueshengziliaoEntity> wrapper);
	

}
