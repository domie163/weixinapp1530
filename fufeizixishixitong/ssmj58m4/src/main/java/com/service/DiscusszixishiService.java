package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszixishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszixishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszixishiView;


/**
 * 自习室评论表
 *
 * @author 
 * @email 
 * @date 2022-02-24 12:10:04
 */
public interface DiscusszixishiService extends IService<DiscusszixishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszixishiVO> selectListVO(Wrapper<DiscusszixishiEntity> wrapper);
   	
   	DiscusszixishiVO selectVO(@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);
   	
   	List<DiscusszixishiView> selectListView(Wrapper<DiscusszixishiEntity> wrapper);
   	
   	DiscusszixishiView selectView(@Param("ew") Wrapper<DiscusszixishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszixishiEntity> wrapper);
   	

}

