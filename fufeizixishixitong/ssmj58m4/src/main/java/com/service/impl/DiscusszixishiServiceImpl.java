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


import com.dao.DiscusszixishiDao;
import com.entity.DiscusszixishiEntity;
import com.service.DiscusszixishiService;
import com.entity.vo.DiscusszixishiVO;
import com.entity.view.DiscusszixishiView;

@Service("discusszixishiService")
public class DiscusszixishiServiceImpl extends ServiceImpl<DiscusszixishiDao, DiscusszixishiEntity> implements DiscusszixishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszixishiEntity> page = this.selectPage(
                new Query<DiscusszixishiEntity>(params).getPage(),
                new EntityWrapper<DiscusszixishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszixishiEntity> wrapper) {
		  Page<DiscusszixishiView> page =new Query<DiscusszixishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszixishiVO> selectListVO(Wrapper<DiscusszixishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszixishiVO selectVO(Wrapper<DiscusszixishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszixishiView> selectListView(Wrapper<DiscusszixishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszixishiView selectView(Wrapper<DiscusszixishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
