package com.dinesh;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.Product;

@Repository
public interface Productdao extends MongoRepository<Product, Integer> {

}