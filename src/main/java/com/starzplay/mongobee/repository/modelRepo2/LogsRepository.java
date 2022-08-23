package com.starzplay.mongobee.repository.modelRepo2;

import com.starzplay.mongobee.model.LogsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogsRepository extends MongoRepository<LogsModel,String> {
}
