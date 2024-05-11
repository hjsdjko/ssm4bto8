package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NianjiDao;
import com.entity.NianjiEntity;
import com.service.NianjiService;
import com.entity.vo.NianjiVO;
import com.entity.view.NianjiView;

@Service("nianjiService")
public class NianjiServiceImpl extends ServiceImpl<NianjiDao, NianjiEntity> implements NianjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NianjiEntity> page = this.selectPage(
                new Query<NianjiEntity>(params).getPage(),
                new EntityWrapper<NianjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NianjiEntity> wrapper) {
		  Page<NianjiView> page =new Query<NianjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NianjiVO> selectListVO(Wrapper<NianjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NianjiVO selectVO(Wrapper<NianjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NianjiView> selectListView(Wrapper<NianjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NianjiView selectView(Wrapper<NianjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
