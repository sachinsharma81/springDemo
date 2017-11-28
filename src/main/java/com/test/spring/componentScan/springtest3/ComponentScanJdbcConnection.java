package com.test.spring.componentScan.springtest3;

import org.springframework.stereotype.Component;

@Component

public class ComponentScanJdbcConnection {
	
	public ComponentScanJdbcConnection() {
		System.out.println("jdbc connection");
	}

}
