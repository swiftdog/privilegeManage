package com.yanfei.scaffolding.privilege;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yanfei.scaffolding.privilege.dao")
@EnableTransactionManagement
public class PrivilegeManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivilegeManageServiceApplication.class, args);
	}
}
