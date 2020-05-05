package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentDao;
import com.app.model.ShipmentType;
@Repository
public class ShipmentDaoImpl  implements IShipmentDao{

	@Autowired
	private HibernateTemplate ht;

	public Integer saveShipmentType(ShipmentType shipmentType) {
		return (Integer) ht.save(shipmentType);
	}

	public void updateShipmentType(ShipmentType shipmentType) {
		ht.update(shipmentType);
	}

	public void deleteShipmentType(Integer shipmentId) {
		ht.delete(new ShipmentType(shipmentId));
	}

	public ShipmentType getShipmentTypeById(Integer shipmentId) {
		return ht.get(ShipmentType.class, shipmentId);
	}

	public List<ShipmentType> getAllShipmentTypes() {
		return ht.loadAll(ShipmentType.class);
	}
}
