package org.gongdel.mongodb.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserDocument {

	@Id
	private String id;

	private String name;

	@Builder
	public UserDocument(String name) {
		this.id = RandomStringUtils.randomAlphanumeric(20);
		this.name = name;
	}
}
