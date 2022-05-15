package com.me.nuworks.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.me.nuworks.pojo.User;



public class UserDAO extends DAO {

	public User get(String userName, String password) throws Exception {
        try {
            begin();
            System.out.println(userName+password);
            Query q = getSession().createQuery("from User where userName = :userName and password = :password");
            q.setString("userName", userName);
            q.setString("password", password);            
            User user = (User) q.uniqueResult();
            close();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get user " + userName, e);
        }
    }
	
	public User getByUsername(String userName) throws Exception {
        try {
            begin();
            Query q = getSession().createQuery("from User where userName = :userName");
            q.setString("userName", userName);
            User user = (User) q.uniqueResult();
            close();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get user " + userName, e);
        }
    }
	
}
