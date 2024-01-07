package com.projetAI.XShore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@SpringBootApplication
public class XShoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(XShoreApplication.class, args);
	}
}