package com.example.billingservice.Controller;

import com.example.billingservice.Entity.Billing;
import com.example.billingservice.Service.BillingService;
import com.example.billingservice.VO.ResponseTemplateVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")

public class BillingController {
    @Autowired
    private BillingService billingService;


    @PostMapping("/")
    public Billing saveBilling(@RequestBody Billing billing){
        return billingService.saveBilling(billing);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getBillingWithPasserger(@PathVariable("id") Long billId){

        return billingService.getBillingWithPasserger(billId);
    }
}
