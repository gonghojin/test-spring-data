package org.gongdel.mongodb.repsotiry;

import org.gongdel.mongodb.domain.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<UserDocument, String> {
}
