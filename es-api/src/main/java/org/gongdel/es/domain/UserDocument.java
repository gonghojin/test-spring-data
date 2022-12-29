package org.gongdel.es.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "user_", createIndex = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserDocument {

	@Id
	private String id;

	@Field(type = FieldType.Text)
	private String name;

	@Builder
	public UserDocument(String name) {
		this.id = RandomStringUtils.randomAlphanumeric(20);
		this.name = name;
	}
}
