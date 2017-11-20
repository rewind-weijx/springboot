package org.springboot.sample.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springboot.sample.entity.Score;
import org.springboot.sample.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IUserDao extends CrudRepository<Score, Integer> {

	User findByName(String loginName);

	Object getList();


}