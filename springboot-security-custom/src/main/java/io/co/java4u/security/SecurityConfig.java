/**
 * 
 */
package io.co.java4u.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author karthik
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("user1").password("secret1").roles("USER").and()
		.withUser("admin1").password("secret1").roles("ADMIN");//"USER", 
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
		.antMatchers("/env/**").hasRole("USER")
		.antMatchers("/**").hasRole("ADMIN");
	}
//.and().csrf().disable().headers().frameOptions().disable()
}
