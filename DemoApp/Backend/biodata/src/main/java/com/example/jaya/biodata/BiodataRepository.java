package com.example.jaya.biodata;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiodataRepository extends MongoRepository<Biodata, String>{

}
