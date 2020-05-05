package com.app.service;

import java.util.List;

import com.app.model.Uom;

public interface IUomTypeService {
	public Integer saveUomType(Uom uomtype);
	public void updateUomType(Uom uomtype);
	public void deleteUom(Integer uomId);
	public Uom getUomTypeById(Integer uomId);
	public List<Uom> getAllUomTypes();

}
