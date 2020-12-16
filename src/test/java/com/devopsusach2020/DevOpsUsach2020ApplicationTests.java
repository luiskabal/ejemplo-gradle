package com.devopsusach2020;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.devopsusach2020.model.Mundial;
import com.devopsusach2020.model.Pais;
import com.devopsusach2020.rest.RestData;


@SpringBootTest

class DevOpsUsach2020ApplicationTests {

	@Test
	void getCountry() {
		RestData restData=new RestData();
		Pais data=restData.getTotalPais("Chile");
		 assertNotNull(data);
	}
	
	@Test
	void getWorld() {
		RestData restData=new RestData();
		Mundial mundo= restData.getTotalMundial();
		assertNotNull(mundo);
	}

}
