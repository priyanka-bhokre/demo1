package com.webcore.app.loandisbursementandledger.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loandisbursementandledger.main.model.EmiDetails;
import com.webcore.app.loandisbursementandledger.main.model.EmiPaymentDetails;
import com.webcore.app.loandisbursementandledger.main.model.LedgerDetails;
import com.webcore.app.loandisbursementandledger.main.model.PaymentHistory;
import com.webcore.app.loandisbursementandledger.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/emiDetails")
	public EmiDetails saveData(@RequestBody EmiDetails ed)
	{
		return hs.saveEmiDetails(ed);
	}
	
	@PostMapping("/emiPaymentDetails")
	public EmiPaymentDetails saveData(@RequestBody EmiPaymentDetails epd)
	{
		return hs.saveEmiPaymentDetails(epd);
	}
	
	@PostMapping("/paymentHistory")
	public PaymentHistory saveData(@RequestBody PaymentHistory ph)
	{
		return hs.savePaymentHistory(ph);
	}
	
	@PostMapping("/ledgerDetails")
	public LedgerDetails saveData(@RequestBody LedgerDetails ld)
	{
		return hs.saveLedgerDetails(ld);
	}

}
