package com.fituous.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fituous.api.models.workouts.Run;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<Run, String> {
}
