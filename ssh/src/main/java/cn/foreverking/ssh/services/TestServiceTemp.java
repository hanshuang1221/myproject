package cn.foreverking.ssh.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceTemp implements TestService {

	public String test() {
		return "test";
	}

}
