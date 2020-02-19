package com.webcore.app.loandisbursementandledger.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loandisbursementandledger.main.model.PaymentHistory;

@Repository
public interface PaymentHistoryReposiory extends CrudRepository<PaymentHistory, Integer>{

}
