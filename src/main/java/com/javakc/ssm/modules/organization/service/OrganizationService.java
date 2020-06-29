package com.javakc.ssm.modules.organization.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.base.util.CommonUtil;
import com.javakc.ssm.modules.organization.dao.OrganizationDao;
import com.javakc.ssm.modules.organization.entity.OrganizationEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 数据字典模块逻辑层实现
 * @author javakc
 * @version 0.1
 */
@Service
@Transactional(readOnly = true)
public class OrganizationService extends BaseService<OrganizationDao, OrganizationEntity>{
	


//	@Transactional(readOnly = false)
//	public void save(DictionaryEntity entity, String[] code, String[] val)
//	{
//		for(int i=0;i<code.length;i++)
//		{
//			entity.setDataId(CommonUtil.uuid());
//			entity.setDataCode(code[i]);
//			entity.setDataVal(val[i]);
//			dictionaryDao.insert(entity);
//		}
//	}
	
}