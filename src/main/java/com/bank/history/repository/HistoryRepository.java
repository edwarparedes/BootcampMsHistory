package com.bank.history.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.history.model.dao.History;

import reactor.core.publisher.Flux;


@Repository
public interface HistoryRepository extends ReactiveMongoRepository<History, String>{
	public Flux<History> findByIdProduct(String idProduct);
}
