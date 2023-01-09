package com.training.rws.galaxe.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.rws.galaxe.model.Reviews;

@RepositoryRestResource(collectionResourceRel = "reviews", path = "reviews")
// http://localhost:9091/reviews Is Created With The Above Line
// Controller Isn't Required As All GET, PUT, POST, DELETE For http://localhost:9091/reviews Is Created
// But If You Want A Customized One, Then Controller Is Required
public interface ReviewsRepository extends PagingAndSortingRepository<Reviews, Long> {

}
