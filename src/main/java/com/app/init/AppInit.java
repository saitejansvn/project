package com.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.config.AppConfig;

//web.xml 
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer{ 

	@Override  
	public Class<?>[] getRootConfigClasses() {   
		return new Class[] {AppConfig.class};  
	} 

	@Override 
	public Class<?>[] getServletConfigClasses() {  
		return null;  
		} 

	@Override  
	public String[] getServletMappings() {  
		return new String[] {"/mvc/*"};  
		} 
} 