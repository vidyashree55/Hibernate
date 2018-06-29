package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class SampleService
{
	@Autowired 
	PersonRepository personRepository ;
		
	
public  List<Person> findAll() {
	return (List<Person>) personRepository.findAll();
}
}