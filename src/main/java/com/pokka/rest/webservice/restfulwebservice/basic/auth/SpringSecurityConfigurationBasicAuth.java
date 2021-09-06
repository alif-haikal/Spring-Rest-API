package com.pokka.rest.webservice.restfulwebservice.basic.auth;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter {
	/********Purpose********/
	//https://www.yawintutor.com/how-to-enable-and-disable-csrf/
	//disable CSRF
	//accpet request to all URL
	//autheticate all other request and use basic authentication
	/********Purpose********/
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll().anyRequest()
				.authenticated().and()
				// .formLogin().and()
				.httpBasic();
	}
}