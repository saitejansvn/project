package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentDao;
import com.app.model.ShipmentType;
import com.app.service.IshipmentService;
@Service

public class IShipmentServiceImpl implements IshipmentService{
@Autowired
	private IShipmentDao dao;
	@Override
	@Transactional
	public Integer saveShipmentType(ShipmentType shipmentType) {
		// TODO Auto-generated method stub
		return dao.saveShipmentType(shipmentType);
	}

	@Override
	@Transactional
	public void updateShipmentType(ShipmentType shipmentType) {
		// TODO Auto-generated method stub
		dao.updateShipmentType(shipmentType);
	}

	@Override
	@Transactional
	public void deleteShipmentType(Integer shipmentId) {
		// TODO Auto-generated method stub
		dao.deleteShipmentType(shipmentId);
	}

	@Override
	@Transactional(readOnly = true)
	public ShipmentType getShipmentTypeById(Integer shipmentId) {
		// TODO Auto-generated method stub
		return dao.getShipmentTypeById(shipmentId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ShipmentType> getAllShipmentTypes() {
		// TODO Auto-generated method stub
		return dao.getAllShipmentTypes();
	}

}
