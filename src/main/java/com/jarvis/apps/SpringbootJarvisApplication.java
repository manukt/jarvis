package com.jarvis.apps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootJarvisApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootJarvisApplication.class);
    }

	//public static void main(String[] args) {
		//SpringApplication.run(SpringbootJarvisApplication.class, args);
	//}
}
