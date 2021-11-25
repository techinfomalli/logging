package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
//Logger logger;
 Logger logger = LoggerFactory.getLogger(User.class);
	
	UserDao userDao = new UserDao();
	public void createUser() {
		logger.info("***userDao.saveUser started***");
		logger.debug("***userDao.saveUser started1***");
		userDao.saveUser();
		logger.info("***userDao.saveUser finished***");
	}

}
