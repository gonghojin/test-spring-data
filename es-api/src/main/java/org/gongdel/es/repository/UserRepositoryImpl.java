package org.gongdel.es.repository;

import org.gongdel.domain.User;
import org.gongdel.es.domain.UserDocument;
import org.gongdel.repository.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private final UserEsRepository dataRepository;

	public UserRepositoryImpl(@Lazy UserEsRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Override
	public String saveUser(User user) {
		UserDocument userDocument = UserDocument.builder()
				.name(user.getName())
				.build();

		dataRepository.save(userDocument);

		return userDocument.getId();
	}

	@Override
	public List<User> findAll() {
		return null;
	}
}
