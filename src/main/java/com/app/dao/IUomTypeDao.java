package com.app.dao;

import java.util.List;

import com.app.model.Uom;

public interface IUomTypeDao
{

	public Integer saveUomType(Uom uomtype);
	public void updateUomType(Uom uomtype);
	public void deleteUom(Integer uomId);
	public Uom getUomTypeById(Integer uomId);
	public List<Uom> getAllUomTypes();
}
