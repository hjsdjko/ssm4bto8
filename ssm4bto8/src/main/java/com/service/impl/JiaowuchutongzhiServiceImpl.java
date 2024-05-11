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


import com.dao.JiaowuchutongzhiDao;
import com.entity.JiaowuchutongzhiEntity;
import com.service.JiaowuchutongzhiService;
import com.entity.vo.JiaowuchutongzhiVO;
import com.entity.view.JiaowuchutongzhiView;

@Service("jiaowuchutongzhiService")
public class JiaowuchutongzhiServiceImpl extends ServiceImpl<JiaowuchutongzhiDao, JiaowuchutongzhiEntity> implements JiaowuchutongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaowuchutongzhiEntity> page = this.selectPage(
                new Query<JiaowuchutongzhiEntity>(params).getPage(),
                new EntityWrapper<JiaowuchutongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaowuchutongzhiEntity> wrapper) {
		  Page<JiaowuchutongzhiView> page =new Query<JiaowuchutongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaowuchutongzhiVO> selectListVO(Wrapper<JiaowuchutongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaowuchutongzhiVO selectVO(Wrapper<JiaowuchutongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaowuchutongzhiView> selectListView(Wrapper<JiaowuchutongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaowuchutongzhiView selectView(Wrapper<JiaowuchutongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
