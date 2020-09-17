package cn.ekgc.mycloud.controller;

import cn.ekgc.mycloud.entity.User;
import cn.ekgc.mycloud.wangbo.WangBoDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("wangBoController")
@RequestMapping("/wangbo")
public class WangBoController {
	@Autowired
	private WangBoDemo wangBoDemo;

	@GetMapping("/miaomiao")
	@ResponseBody
	public String say(String name) throws Exception{
		return wangBoDemo.sayHello(name);
	}

	@GetMapping("/marry")
	@ResponseBody
	public String marry(User user) throws Exception{
		return wangBoDemo.marry(user);
	}
}
