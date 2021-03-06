/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.yogee.yogee.module.sys.dao;

import com.yogee.yogee.common.persistence.TreeDao;
import com.yogee.yogee.module.sys.entity.Office;
import org.apache.ibatis.annotations.Mapper;

/**
 * 机构DAO接口
 *
 * @author Liyuan
 * @version 2018-03-21
 */
@Mapper
public interface OfficeDao extends TreeDao<Office> {

}
