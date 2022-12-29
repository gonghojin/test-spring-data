package org.gongdel.repository;

import org.gongdel.domain.User;

import java.util.List;

public interface UserRepository {

	public String saveUser(User user);

	public List<User> findAll();
}
