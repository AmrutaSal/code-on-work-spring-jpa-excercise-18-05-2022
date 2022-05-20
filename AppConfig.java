package com.spring.data.jpa;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = {"com.spring.data.jpa"})
public class AppConfig 
{
	@Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
    	LocalEntityManagerFactoryBean factoryBean=
    			new LocalEntityManagerFactoryBean();
    	
    	factoryBean.setPersistenceUnitName("SpringDataJPADemo");
    	return factoryBean;
    }
    
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
    	JpaTransactionManager tm = new JpaTransactionManager();
    	
    	tm.setEntityManagerFactory(emf);
    	return tm;
    }

}
