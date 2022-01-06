package com.harshitha.shopping.walletservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harshitha.shopping.walletservice.entity.Statement;

import java.util.List;

@Repository
public interface StatementRepository extends MongoRepository<Statement, String> {

    List<Statement> findByWalletId(int walletId);
}
