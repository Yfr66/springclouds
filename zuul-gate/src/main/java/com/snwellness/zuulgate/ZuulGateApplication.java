package com.snwellness.zuulgate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateApplication {

    @Bean
    public MyFilter myFilter(){
        return  new MyFilter();
    }

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateApplication.class, args);
	}
}
