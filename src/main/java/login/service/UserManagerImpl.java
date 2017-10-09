package login.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.domain.User;
import login.manager.UserManager;
import login.repository.UserRepository;

@Service
public class UserManagerImpl implements UserManager{

private static Logger logger = LoggerFactory.getLogger(UserManagerImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(String username, String password, String role) {
		
		logger.info("creating user!");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		return userRepository.save(user);
	}
}
