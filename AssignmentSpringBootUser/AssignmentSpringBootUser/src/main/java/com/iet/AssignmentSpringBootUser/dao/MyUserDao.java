package com.iet.AssignmentSpringBootUser.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iet.AssignmentSpringBootUser.beans.MyUser;


public interface MyUserDao extends JpaRepository<MyUser, Integer>{

}
