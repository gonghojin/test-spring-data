package org.gongdel.mongodb.repsotiry;

import org.gongdel.domain.User;
import org.gongdel.mongodb.domain.UserDocument;
import org.gongdel.repository.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Common api 구현체- 몽고디비 버전
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	/**
	 * 스프링 DATA 모듈 사용
	 */
	private final UserMongoRepository repo;

	public UserRepositoryImpl(@Lazy UserMongoRepository repo) {
		this.repo = repo;
	}

	@Override
	public String saveUser(User user) {
		UserDocument build = UserDocument.builder()
				.name(user.getName())
				.build();

		return repo.save(build).getId();
	}

	@Override
	public List<org.gongdel.domain.User> findAll() {
		return repo.findAll().stream()
				.map(
						obj ->
								org.gongdel.domain.User.builder()
										.name(obj.getName())
										.build()
				).collect(Collectors.toList());
	}
}
