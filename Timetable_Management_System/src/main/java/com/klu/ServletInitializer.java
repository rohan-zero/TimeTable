package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	@Autowired
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TimetableManagementSystemApplication.class);
	}

}
