package org.gongdel.es.repository;

import org.gongdel.domain.User;
import org.gongdel.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.elasticsearch.DataElasticsearchTest;

import static org.junit.jupiter.api.Assertions.*;

@DataElasticsearchTest
class UserRepositoryImplTest {

	@Autowired UserEsRepository repository;
	UserRepository target;

	@BeforeEach
	void setUp() {
		target = new UserRepositoryImpl(repository);
	}

	@Test
	void testSaveUser() {
		target.saveUser(User.builder().name("gongdel").build());
	}

	@Test
	void testFindAll() {
	}
}