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


import com.dao.DaibanshixiangDao;
import com.entity.DaibanshixiangEntity;
import com.service.DaibanshixiangService;
import com.entity.vo.DaibanshixiangVO;
import com.entity.view.DaibanshixiangView;

@Service("daibanshixiangService")
public class DaibanshixiangServiceImpl extends ServiceImpl<DaibanshixiangDao, DaibanshixiangEntity> implements DaibanshixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaibanshixiangEntity> page = this.selectPage(
                new Query<DaibanshixiangEntity>(params).getPage(),
                new EntityWrapper<DaibanshixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaibanshixiangEntity> wrapper) {
		  Page<DaibanshixiangView> page =new Query<DaibanshixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaibanshixiangVO> selectListVO(Wrapper<DaibanshixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaibanshixiangVO selectVO(Wrapper<DaibanshixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaibanshixiangView> selectListView(Wrapper<DaibanshixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaibanshixiangView selectView(Wrapper<DaibanshixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
