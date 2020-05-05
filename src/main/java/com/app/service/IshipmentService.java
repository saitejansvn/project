package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IshipmentService 
{

	public Integer saveShipmentType(ShipmentType shipmentType);
	public void updateShipmentType(ShipmentType shipmentType);
	public void deleteShipmentType(Integer shipmentId);
	public ShipmentType getShipmentTypeById(Integer shipmentId);
	public List<ShipmentType> getAllShipmentTypes();
}
