/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.yogee.yogee.module.sys.dao;

import com.yogee.yogee.common.persistence.CrudDao;
import com.yogee.yogee.module.sys.entity.Log;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日志DAO接口
 *
 * @author Liyuan
 * @version 2018-03-21
 */
@Mapper
public interface LogDao extends CrudDao<Log> {

}
