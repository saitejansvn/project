package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomTypeDao;
import com.app.model.Uom;
import com.app.service.IUomTypeService;
@Service
public class UomServiceImpl implements IUomTypeService
{
	@Autowired
private IUomTypeDao dao;
	@Override
	@Transactional
	public Integer saveUomType(Uom uomtype) {
		// TODO Auto-generated method stub
		return dao.saveUomType(uomtype);
	}

	@Override
	@Transactional
	public void updateUomType(Uom uomtype) {
		// TODO Auto-generated method stub
		dao.updateUomType(uomtype);
	}

	@Override
	@Transactional
	public void deleteUom(Integer uomId) {
		// TODO Auto-generated method stub
		dao.deleteUom(uomId);
	}

	@Override
	@Transactional(readOnly = true)
	public Uom getUomTypeById(Integer uomId) {
		// TODO Auto-generated method stub
		return dao.getUomTypeById(uomId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Uom> getAllUomTypes() {
		// TODO Auto-generated method stub
		return dao.getAllUomTypes();
	}
}