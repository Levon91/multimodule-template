package com.example.project.web.config;

import com.example.project.data.config.DataConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Import(DataConfig.class)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * Configures the security of all http requests
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

    }
}