package org.gongdel.es.repository;

import org.gongdel.es.domain.UserDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserEsRepository extends ElasticsearchRepository<UserDocument, String> {
}
