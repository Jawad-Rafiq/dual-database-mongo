package com.starzplay.mongobee.repository.modelRepo2;

import com.starzplay.mongobee.model.Model2;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Model2Repository extends MongoRepository<Model2,String> {
}
