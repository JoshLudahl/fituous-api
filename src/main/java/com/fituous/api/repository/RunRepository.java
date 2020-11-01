package com.fituous.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fituous.api.models.Run;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RunRepository extends MongoRepository<Run, String> {
}
