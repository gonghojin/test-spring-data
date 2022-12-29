package org.gongdel.coreapi.dao;

import org.gongdel.coreapi.dao.UserDaoAdapter;
import org.gongdel.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserDaoAdapterTest {

	@Autowired
	UserDaoAdapter adapter;

	@Test
	void testTestSave() {
		adapter.testSave();
		List<User> all =
				adapter.findAll();
		System.out.println(all);
	}

	@Test
	void testFindAll() {
	}
}