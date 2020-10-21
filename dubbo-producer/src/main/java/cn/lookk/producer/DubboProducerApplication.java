package cn.lookk.producer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubboConfiguration
@SpringBootApplication
@MapperScan(basePackages = "cn.lookk.producer.mapper")
@ComponentScan("cn.lookk.*")
public class DubboProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProducerApplication.class, args);
	}

}
