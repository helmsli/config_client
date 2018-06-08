package com.xinwei.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//需要引入变量的地方自动刷新
@RefreshScope
public class HelloConfigClientController {

	@Value("${foo}")
	private String foo;

	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("Hello is ConfigClient.");
		return foo;
	}
	
	// @RefreshScope
	// http://172.18.10.34:8881/refresh
	// 使用PostMan调用Method=Post
}
