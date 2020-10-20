package cn.lookk.customer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboCustomerApplication.class, args);
	}

}
