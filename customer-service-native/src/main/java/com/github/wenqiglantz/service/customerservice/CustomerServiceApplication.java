package com.github.wenqiglantz.service.customerservice;

//import org.hibernate.dialect.PostgreSQL95Dialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.nativex.hint.TypeHint;

@SpringBootApplication
//@TypeHint(types = PostgreSQL95Dialect.class, typeNames = "org.hibernate.dialect.PostgreSQLDialect")
public class CustomerServiceApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication app = new SpringApplication(CustomerServiceApplication.class);
    app.run();
  }
}
