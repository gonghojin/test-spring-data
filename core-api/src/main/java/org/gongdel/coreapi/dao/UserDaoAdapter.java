package org.gongdel.coreapi.dao;

import lombok.RequiredArgsConstructor;
import org.gongdel.domain.User;
import org.gongdel.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDaoAdapter {

	private final UserRepository testRepo;
	public void testSave() {
		User user = User.builder()
				.name("gongdel"
				).build();
		testRepo.saveUser(user);
	}

	public List<User> findAll() {
		return testRepo.findAll();
	}
}
