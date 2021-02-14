package com.example.IncrementNumber.Glaucus;


import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ServiceCode {
	
	
	DAO dao;
	
	@Autowired
	public void setMrp(DAO dao) {
		this.dao = dao;
	}
	
	public int GetLastNumber()
	{
		return dao.getNumber();
	}
	
	
	@Async
	public ModelData GetUpdate()
	{
		synchronized (dao) {
			ModelData mData=null;
			Optional<ModelData> hin1=dao.findById(1);
			if(hin1.isPresent())
			{
				mData=hin1.get();
				mData.setUserNumber(dao.getUserNumber(1)+1);
				dao.save(mData);
			}
			return mData;
		}
		
	}

}
