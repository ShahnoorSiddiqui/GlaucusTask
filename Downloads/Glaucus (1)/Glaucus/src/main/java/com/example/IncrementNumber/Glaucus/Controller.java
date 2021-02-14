package com.example.IncrementNumber.Glaucus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*")
@RestController
public class Controller {

	ServiceCode srv;
	
	@Autowired
	public void setAps(ServiceCode srv) {
		this.srv  = srv;
	}
	
	@GetMapping("/GetUserNumber")
	public int GetLast()
	{
	  return srv.GetLastNumber();
		
	}
	
	@GetMapping("/GetUpdate")
	public ModelData GetUpdate()
	{
	  return srv.GetUpdate();
		
	}
}
