package com.webcore.app.loandisbursementandledger.main.service;

import com.webcore.app.loandisbursementandledger.main.model.EmiDetails;
import com.webcore.app.loandisbursementandledger.main.model.EmiPaymentDetails;
import com.webcore.app.loandisbursementandledger.main.model.LedgerDetails;
import com.webcore.app.loandisbursementandledger.main.model.PaymentHistory;

public interface HomeService {

	EmiDetails saveEmiDetails(EmiDetails ed);
	EmiPaymentDetails saveEmiPaymentDetails(EmiPaymentDetails epd);
	PaymentHistory savePaymentHistory(PaymentHistory ph);
	LedgerDetails saveLedgerDetails(LedgerDetails ld);
}
