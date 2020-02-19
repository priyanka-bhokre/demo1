package com.webcore.app.loandisbursementandledger.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loandisbursementandledger.main.model.EmiDetails;
import com.webcore.app.loandisbursementandledger.main.model.EmiPaymentDetails;
import com.webcore.app.loandisbursementandledger.main.model.LedgerDetails;
import com.webcore.app.loandisbursementandledger.main.model.PaymentHistory;
import com.webcore.app.loandisbursementandledger.main.repository.EmiDetailsRepository;
import com.webcore.app.loandisbursementandledger.main.repository.EmiPaymentDetailsRepository;
import com.webcore.app.loandisbursementandledger.main.repository.LedgerDetailsRepository;
import com.webcore.app.loandisbursementandledger.main.repository.PaymentHistoryReposiory;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	EmiDetailsRepository edr;
	@Autowired
	EmiPaymentDetailsRepository epdr;
	@Autowired
	PaymentHistoryReposiory phr;
	@Autowired
	LedgerDetailsRepository ldr;
	
	@Override
	public EmiDetails saveEmiDetails(EmiDetails ed) {
		return edr.save(ed);
	}

	@Override
	public EmiPaymentDetails saveEmiPaymentDetails(EmiPaymentDetails epd) {
		
		return epdr.save(epd);
	}

	@Override
	public PaymentHistory savePaymentHistory(PaymentHistory ph) {
		
		return phr.save(ph);
	}

	@Override
	public LedgerDetails saveLedgerDetails(LedgerDetails ld) {
		
		return ldr.save(ld);
	}

}
