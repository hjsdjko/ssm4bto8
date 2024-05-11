package com.dao;

import com.entity.NianjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NianjiVO;
import com.entity.view.NianjiView;


/**
 * 年级
 * 
 * @author 
 * @email 
 * @date 2022-02-26 18:00:12
 */
public interface NianjiDao extends BaseMapper<NianjiEntity> {
	
	List<NianjiVO> selectListVO(@Param("ew") Wrapper<NianjiEntity> wrapper);
	
	NianjiVO selectVO(@Param("ew") Wrapper<NianjiEntity> wrapper);
	
	List<NianjiView> selectListView(@Param("ew") Wrapper<NianjiEntity> wrapper);

	List<NianjiView> selectListView(Pagination page,@Param("ew") Wrapper<NianjiEntity> wrapper);
	
	NianjiView selectView(@Param("ew") Wrapper<NianjiEntity> wrapper);
	

}
