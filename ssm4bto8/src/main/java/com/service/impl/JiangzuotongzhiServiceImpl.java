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


import com.dao.JiangzuotongzhiDao;
import com.entity.JiangzuotongzhiEntity;
import com.service.JiangzuotongzhiService;
import com.entity.vo.JiangzuotongzhiVO;
import com.entity.view.JiangzuotongzhiView;

@Service("jiangzuotongzhiService")
public class JiangzuotongzhiServiceImpl extends ServiceImpl<JiangzuotongzhiDao, JiangzuotongzhiEntity> implements JiangzuotongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangzuotongzhiEntity> page = this.selectPage(
                new Query<JiangzuotongzhiEntity>(params).getPage(),
                new EntityWrapper<JiangzuotongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangzuotongzhiEntity> wrapper) {
		  Page<JiangzuotongzhiView> page =new Query<JiangzuotongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangzuotongzhiVO> selectListVO(Wrapper<JiangzuotongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangzuotongzhiVO selectVO(Wrapper<JiangzuotongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangzuotongzhiView> selectListView(Wrapper<JiangzuotongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangzuotongzhiView selectView(Wrapper<JiangzuotongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
