package com.tca.cofig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Configuration
public class MyConfig {
	
	@Bean
	 public SimpleJdbcCall getJdbcCall(DataSource ds)
	 {
		return new SimpleJdbcCall(ds).withFunctionName("get_grade");
	 }

}
