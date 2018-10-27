package com.lzpeng.sprintboot.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class MobileApplication {

	@GetMapping
	public String hello(Device device){
		return String.format("%s : %s %s", new Date(), device, getClass().getName());
	}

	public static void main(String[] args) {
		SpringApplication.run(MobileApplication.class, args);
	}
}
