/**
 * Copyright (c) 2017-Now http://www.yogee.xin All rights reserved.
 */
package com.yogee.yogee.module.sys.utils;



import java.util.List;

/**
 * 
 * @author ThinkGem
 * @version 2017年3月1日
 */
public class AreaUtils {

//	// 系统缓存常量
//	public static final String CACHE_AREA_ALL_LIST = "areaAllList";
//
//	/**
//	 * 静态内部类，延迟加载，懒汉式，线程安全的单例模式
//	 */
//	private static final class Static {
//		private static AreaService areaService = SpringUtils.getBean(AreaService.class);
//	}
//
//	/**
//	 * 获取所有区域列表（系统级别缓存）
//	 * @return
//	 */
//	public static List<Area> getAreaAllList(){
//		@SuppressWarnings("unchecked")
//		List<Area> areaList = (List<Area>)CacheUtils.get(CACHE_AREA_ALL_LIST);
//		if (areaList == null){
//			areaList = Static.areaService.findList(new Area());
//			CacheUtils.put(CACHE_AREA_ALL_LIST, areaList);
//		}
//		return areaList;
//	}
//
//	/**
//	 * 清理区域缓存
//	 */
//	public static void clearCache(){
//		CacheUtils.remove(CACHE_AREA_ALL_LIST);
//	}
	
}
