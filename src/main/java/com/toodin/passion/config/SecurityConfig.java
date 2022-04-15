package com.toodin.passion.config;

import com.toodin.passion.security.CustomizedUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SpringSecurity config
 *
 * @author kenzo
 * @date 2022-03-29 16:58
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().permitAll();
    }

    // 配置用户存储
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*auth
                .inMemoryAuthentication()
                .withUser("admin").password(passwordEncoder().encode("1234")).roles("ADMIN");*/
        auth.userDetailsService(new CustomizedUserDetailService());
    }

}
