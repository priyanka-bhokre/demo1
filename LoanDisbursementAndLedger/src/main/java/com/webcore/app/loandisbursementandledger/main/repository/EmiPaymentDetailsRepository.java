package com.webcore.app.loandisbursementandledger.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loandisbursementandledger.main.model.EmiPaymentDetails;

@Repository
public interface EmiPaymentDetailsRepository extends CrudRepository<EmiPaymentDetails, Integer>{

}
