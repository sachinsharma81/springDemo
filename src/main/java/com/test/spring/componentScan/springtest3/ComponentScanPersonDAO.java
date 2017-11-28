package com.test.spring.componentScan.springtest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentScanPersonDAO {
	
	@Autowired
	ComponentScanJdbcConnection jdbcCon;

	public ComponentScanJdbcConnection getJdbcCon() {
		return jdbcCon;
	}

	public void setJdbcCon(ComponentScanJdbcConnection jdbcCon) {
		this.jdbcCon = jdbcCon;
	}



}
