package com.dylanharper.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dylanharper.navigationBar", "com.dylanharper.webApps", "com.dylanharper.resume"})
@ServletComponentScan(basePackages ={"com.dylanharper.navigationBar", "com.dylanharper.webApps",  "com.dylanharper.resume"})
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
