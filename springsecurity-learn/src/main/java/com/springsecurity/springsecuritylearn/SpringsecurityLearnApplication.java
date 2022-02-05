package com.springsecurity.springsecuritylearn;

import com.springsecurity.springsecuritylearn.model.User;
import com.springsecurity.springsecuritylearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecurityLearnApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setUsername("john");
		user.setEmail("john@gmail.com");
		user.setPassword(bCryptPasswordEncoder.encode("john"));
		user.setRoles("ROLE_NORMAL");
		userRepository.save(user);

		User user1 = new User();
		user1.setUsername("roshni");
		user1.setEmail("roshni@gmail.com");
		user1.setPassword(bCryptPasswordEncoder.encode("1234"));
		user1.setRoles("ROLE_ADMIN");
		userRepository.save(user1);

	}
}
