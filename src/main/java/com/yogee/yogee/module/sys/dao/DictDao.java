/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.yogee.yogee.module.sys.dao;

import com.yogee.yogee.common.persistence.CrudDao;
import com.yogee.yogee.module.sys.entity.Dict;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 字典DAO接口
 *
 * @author Liyuan
 * @version 2018-03-21
 */
@Mapper
public interface DictDao extends CrudDao<Dict> {

    List<String> findTypeList(Dict dict);

}
