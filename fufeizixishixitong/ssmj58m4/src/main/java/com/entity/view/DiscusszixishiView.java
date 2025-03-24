package com.entity.view;

import com.entity.DiscusszixishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 自习室评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 12:10:04
 */
@TableName("discusszixishi")
public class DiscusszixishiView  extends DiscusszixishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszixishiView(){
	}
 
 	public DiscusszixishiView(DiscusszixishiEntity discusszixishiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszixishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
