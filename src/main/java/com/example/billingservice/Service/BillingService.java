package com.example.billingservice.Service;

import com.example.billingservice.Entity.Billing;
import com.example.billingservice.Repository.BillingRepository;
import com.example.billingservice.VO.Passenger;
import com.example.billingservice.VO.ResponseTemplateVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class BillingService {
    @Autowired
    private BillingRepository billingRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Billing saveBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    public ResponseTemplateVO getBillingWithPasserger(Long billId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Billing billing = billingRepository.findById(billId).get();
        vo.setBilling(billing);
        Passenger passenger =
                restTemplate.getForObject("http:8080/passenger/"
                                + billing.getPassengerID(),
                        Passenger.class);

        vo.setPassenger(passenger);

        return vo;
}
}
