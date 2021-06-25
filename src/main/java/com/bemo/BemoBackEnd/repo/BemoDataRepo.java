package com.bemo.BemoBackEnd.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bemo.BemoBackEnd.dto.BemoDataDto;

@Repository
public interface BemoDataRepo extends MongoRepository<BemoDataDto, String> {

}
