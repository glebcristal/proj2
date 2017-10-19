package com.prog.springgleb;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableAutoConfiguration (exclude = { DataSourceAutoConfiguration.class ,HibernateJpaAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class })
@PropertySource({"classpath:application.properties"})
public class SpringGlebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGlebApplication.class, args);
	}
}
