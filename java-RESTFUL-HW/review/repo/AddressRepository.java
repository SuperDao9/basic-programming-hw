package com.udomsin.review.repo;

import org.springframework.data.repository.CrudRepository;

import com.udomsin.review.model.Address;


public interface AddressRepository extends CrudRepository<Address, Integer> {

}