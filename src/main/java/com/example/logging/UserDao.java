package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {

//	Logger logger;
	 Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	public void saveUser() {
		logger.info("***UserDao.saveUser started***");
		//Connected to db and saved
		logger.info("***UserDao.saveUser finished***");
	}
}
