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


import com.dao.XueshengziliaoDao;
import com.entity.XueshengziliaoEntity;
import com.service.XueshengziliaoService;
import com.entity.vo.XueshengziliaoVO;
import com.entity.view.XueshengziliaoView;

@Service("xueshengziliaoService")
public class XueshengziliaoServiceImpl extends ServiceImpl<XueshengziliaoDao, XueshengziliaoEntity> implements XueshengziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengziliaoEntity> page = this.selectPage(
                new Query<XueshengziliaoEntity>(params).getPage(),
                new EntityWrapper<XueshengziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengziliaoEntity> wrapper) {
		  Page<XueshengziliaoView> page =new Query<XueshengziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengziliaoVO> selectListVO(Wrapper<XueshengziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengziliaoVO selectVO(Wrapper<XueshengziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengziliaoView> selectListView(Wrapper<XueshengziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengziliaoView selectView(Wrapper<XueshengziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
