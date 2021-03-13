package com.app.service;

import java.util.List;

import com.app.pojos.Buyer;
import com.app.pojos.LandProperty;
import com.app.pojos.OwnershipType;
import com.app.pojos.PropertyType;

public interface ILandPropertyService {
	
	// add new landProperty
	LandProperty saveNewProperty(LandProperty l);
	
	//fetch pr
	
	//fetch property by ownerId
	List<LandProperty> fetchPropertyByOId(int ownerId);
	
	
	
	
	//fetch prop by id
	LandProperty fetchById(int propId);
	
	//delete prop by id
	LandProperty deletePropertyByEntity(LandProperty l);
	
	//update prop by id
	LandProperty updateProperty(int propId , LandProperty l);
	
	// fetch favBuyers of prop
	List<Buyer> fetchAllFavBuyers(int propId);
	
	List<LandProperty> fetchPropByType(PropertyType propType);
	
	List<LandProperty> fetchPropByOwnerType(OwnershipType ownerType);
}
