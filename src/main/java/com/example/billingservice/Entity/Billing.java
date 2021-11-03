package com.example.billingservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Billing {
    @Id
    @GeneratedValue
    private Long BillId;
    private String Name;
    private String Price;
    private String PassengerID;
}
