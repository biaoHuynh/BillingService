package com.example.billingservice.VO;

import com.example.billingservice.Entity.Billing;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    private Passenger passenger;
    private Billing billing;
}
