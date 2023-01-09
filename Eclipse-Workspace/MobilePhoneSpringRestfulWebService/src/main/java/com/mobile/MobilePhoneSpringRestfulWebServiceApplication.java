package com.mobile;

import com.mobile.phone.pms.model.MobilePhone;
import com.mobile.phone.pms.service.MobilePhoneService;
import com.mobile.phone.pms.service.MobilePhoneServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
//@ComponentScan(basePackages = {"com.mobile"})
@SpringBootApplication
public class MobilePhoneSpringRestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePhoneSpringRestfulWebServiceApplication.class, args);
		System.out.println("Mobile Phone Application Running!");
	}
}
