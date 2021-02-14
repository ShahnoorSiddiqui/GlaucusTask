package com.example.IncrementNumber.Glaucus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DAO extends JpaRepository<ModelData, Integer>{

	@Query("Select m.UserNumber from ModelData m WHERE m.UserId=?1")
	public int getUserNumber(int id);
	
	@Query("Select UserNumber from ModelData")
	public int getNumber();
}
