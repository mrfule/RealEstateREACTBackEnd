package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOwnerDao;
import com.app.pojos.Buyer;
import com.app.pojos.Owner;

@Service
@Transactional
public class OwnerServiceImpl implements IOwnerService{
	
	@Autowired
	private IOwnerDao ownerDao;
	
	public OwnerServiceImpl() {
		System.out.println("Owener Service called");
	}

	@Override
	public List<Owner> getAllOwners() {
		return ownerDao.findAll();
	}

	@Override
	public Owner saveOwner(Owner o) {
		return ownerDao.save(o);
	}

	@Override
	public Owner getOwner(String email, String password) {	
		return ownerDao.findByOwnerEmailAndOwnerPassword(email, password);
	}

	@Override
	public Owner getByOwnerId(int ownerId) {
		return ownerDao.findByOwnerId(ownerId);
	}
	
	
}