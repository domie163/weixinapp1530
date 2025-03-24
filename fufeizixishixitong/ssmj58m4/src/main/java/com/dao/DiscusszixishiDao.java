package com.dao;

import com.entity.DiscusszixishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszixishiVO;
import com.entity.view.DiscusszixishiView;


/**
 * 自习室评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-24 12:10:04
 */
public interface DiscusszixishiDao extends BaseMapper<DiscusszixishiEntity> {
	
	List<DiscusszixishiVO> selectListVO(@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);
	
	DiscusszixishiVO selectVO(@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);
	
	List<DiscusszixishiView> selectListView(@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);

	List<DiscusszixishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);
	
	DiscusszixishiView selectView(@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);
	

}
