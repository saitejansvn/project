package com.app.config;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement ;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.ShipmentType;
import com.app.model.Uom;
import com.app.model.User;

@EnableWebMvc //it is Spring WEB MVC AppConfig 
@EnableTransactionManagement // enable commit/rollback 
@Configuration 
@ComponentScan(basePackages="com.app") //<context:component-scan 
public class AppConfig{  


	//1. DataSource 
	@Bean  
	public BasicDataSource dsObj() {   
		BasicDataSource ds=new BasicDataSource();   
		ds.setDriverClassName("com.mysql.jdbc.Driver");   
		ds.setUrl("jdbc:mysql://localhost:3306/test");  
		ds.setUsername("root");  
		ds.setPassword("root");  
		return ds;  
	}  
	//2. SessionFactory  
	@Bean 
	public LocalSessionFactoryBean sfObj() {   
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();  
		sf.setDataSource(dsObj());
		sf.setHibernateProperties(props());   
		/* TODO pass model classes */  
		sf.setAnnotatedClasses(ShipmentType.class,Uom.class,User.class); //Model class names  
		return sf;  
	}   
	private Properties props() {   
		Properties p=new Properties();  
		p.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");  
		p.put("hibernate.show_sql","true");  
		p.put("hibernate.format_sql", "true");  
		p.put("hibernate.hbm2ddl.auto", "create");  
		return p;  
	}  
	//3. HibernateTemplate  
	@Bean  
	public HibernateTemplate htObj() {   
		HibernateTemplate ht=new HibernateTemplate();  
		ht.setSessionFactory(sfObj().getObject());   
		return ht;  
	}
	//4. Transaction Manager 
	@Bean  
	public HibernateTransactionManager htmObj() { 
		HibernateTransactionManager htm=new HibernateTransactionManager();   
		htm.setSessionFactory(sfObj().getObject());  
		return htm;  
	}   
	//5. View Resolver 
	@Bean  
	public InternalResourceViewResolver ivr() {   
		InternalResourceViewResolver v=new InternalResourceViewResolver();   
		v.setPrefix("/WEB-INF/VIEWS/"); //location of UI file  
		v.setSuffix(".jsp"); //extension of UI file   
		return v;  

	} 
}