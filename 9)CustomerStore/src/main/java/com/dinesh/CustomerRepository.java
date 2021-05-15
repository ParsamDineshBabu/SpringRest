package com.dinesh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.CustomerEntity;
 
@Repository
public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Long> {
 
}
