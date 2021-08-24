package com.udomsin.review.repo;

import org.springframework.data.repository.CrudRepository;

import com.udomsin.review.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}