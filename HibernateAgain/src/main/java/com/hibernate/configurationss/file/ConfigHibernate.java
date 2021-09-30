package com.hibernate.configurationss.file;

import java.util.Properties;

import javax.sql.DataSource;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
//@EnableTransactionManagement
//@EnableWebMvc
public class ConfigHibernate {
//	@Bean("ds")
//	public DataSource getDataSource() {
//		DriverManagerDataSource ds = new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/school");
//		ds.setUsername("root");
//		ds.setPassword("900482");
//
//		return ds;
//	}
//
//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//		sessionFactory.setDataSource(getDataSource());
//		sessionFactory.setPackagesToScan("com.springmvc.beans");
//		sessionFactory.setHibernateProperties(hibernateProperties());
//
//		return sessionFactory;
//	}
//
//	@Bean
//	public PlatformTransactionManager hibernateTransactionManager() {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//		transactionManager.setSessionFactory(sessionFactory().getObject());
//		return transactionManager;
//	}
//	
//	@Bean
//	public HibernateTemplate getTemplate() {
//		HibernateTemplate template = new HibernateTemplate();
//		template.setSessionFactory(sessionFactory().getObject());
//		template.setCheckWriteOperations(false);
//		return template;
//	}
//
//	public Properties hibernateProperties() {
//		Properties properties = new Properties();
//		properties.put("hibernate.hbm2ddl.auto", "update");
//		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
//		properties.put("hibernate.show_sql", true);
//
//		return properties;
//	}
//	
//

}
