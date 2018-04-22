package cn.foreverking.ssh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.foreverking.ssh.dao.PersonRepository;
import cn.foreverking.ssh.dao.po.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Long savePerson() {
		Person person = new Person();
		person.setUsername("XRog");
		person.setPhone("18381005946");
		person.setAddress("chenDu");
		person.setRemark("this is XRog");
		return personRepository.save(person);
	}

}
