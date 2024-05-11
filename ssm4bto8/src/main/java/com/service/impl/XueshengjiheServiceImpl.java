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


import com.dao.XueshengjiheDao;
import com.entity.XueshengjiheEntity;
import com.service.XueshengjiheService;
import com.entity.vo.XueshengjiheVO;
import com.entity.view.XueshengjiheView;

@Service("xueshengjiheService")
public class XueshengjiheServiceImpl extends ServiceImpl<XueshengjiheDao, XueshengjiheEntity> implements XueshengjiheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjiheEntity> page = this.selectPage(
                new Query<XueshengjiheEntity>(params).getPage(),
                new EntityWrapper<XueshengjiheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjiheEntity> wrapper) {
		  Page<XueshengjiheView> page =new Query<XueshengjiheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjiheVO> selectListVO(Wrapper<XueshengjiheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjiheVO selectVO(Wrapper<XueshengjiheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjiheView> selectListView(Wrapper<XueshengjiheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjiheView selectView(Wrapper<XueshengjiheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
