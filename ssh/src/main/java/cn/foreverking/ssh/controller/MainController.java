package cn.foreverking.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.foreverking.ssh.services.PersonService;
import cn.foreverking.ssh.services.TestService;

@Controller
public class MainController {

	@Autowired
	private TestService testService;

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}

	@RequestMapping(value = "springtest", method = RequestMethod.GET)
	public String springTest() {
		return testService.test();
	}

	@RequestMapping(value = "savePerson", method = RequestMethod.GET)
	@ResponseBody
	public String savePerson() {
		personService.savePerson();
		return "success!";
	}

}
