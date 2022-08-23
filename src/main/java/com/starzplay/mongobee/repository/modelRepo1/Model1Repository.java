package com.starzplay.mongobee.repository.modelRepo1;

import com.starzplay.mongobee.model.Model1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Model1Repository  extends MongoRepository<Model1,String> {
}
