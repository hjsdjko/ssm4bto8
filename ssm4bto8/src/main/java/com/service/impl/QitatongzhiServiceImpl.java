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


import com.dao.QitatongzhiDao;
import com.entity.QitatongzhiEntity;
import com.service.QitatongzhiService;
import com.entity.vo.QitatongzhiVO;
import com.entity.view.QitatongzhiView;

@Service("qitatongzhiService")
public class QitatongzhiServiceImpl extends ServiceImpl<QitatongzhiDao, QitatongzhiEntity> implements QitatongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QitatongzhiEntity> page = this.selectPage(
                new Query<QitatongzhiEntity>(params).getPage(),
                new EntityWrapper<QitatongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QitatongzhiEntity> wrapper) {
		  Page<QitatongzhiView> page =new Query<QitatongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QitatongzhiVO> selectListVO(Wrapper<QitatongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QitatongzhiVO selectVO(Wrapper<QitatongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QitatongzhiView> selectListView(Wrapper<QitatongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QitatongzhiView selectView(Wrapper<QitatongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
