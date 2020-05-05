package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomTypeDao;
import com.app.model.Uom;
@Repository
public class UomDaoImpl implements IUomTypeDao {
    @Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveUomType(Uom uomtype) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(uomtype);
	}

	@Override
	public void updateUomType(Uom uomtype) {
		// TODO Auto-generated method stub
		ht.update(uomtype);
	}

	@Override
	public void deleteUom(Integer uomId) {
		// TODO Auto-generated method stub
		ht.delete(new Uom(uomId));
	}

	@Override
	public Uom getUomTypeById(Integer uomId) {
		// TODO Auto-generated method stub
		return ht.get(Uom.class,uomId);
	}

	@Override
	public List<Uom> getAllUomTypes() {
		// TODO Auto-generated method stub
		return ht.loadAll(Uom.class);
	}
}