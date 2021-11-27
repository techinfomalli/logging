package com.example.logging;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User {
	

 Logger logger = LoggerFactory.getLogger(User.class);
	@Autowired
	UserDao userDao;
	public void createUser() {
		logger.info("***userDao.saveUser started***");
		logger.debug("***userDao.saveUser started1***");
		userDao.saveUser();
		logger.info("***userDao.saveUser finished***");
	}

}
