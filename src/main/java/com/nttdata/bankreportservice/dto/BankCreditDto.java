package com.nttdata.bankreportservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankCreditDto {

    private String id;
    //number credit of the bank credit
    private String numberCredit;
    //amount of the bank credit
    private Float amount;
    //credit
    private Float credit;
    //end date of the bank credit
    private String endDate;
    //id of the client
    private String customerId;
    //full name of the client
    private String customerName;
    //type of the bank credit
    private String type;
    //creation date of the bank account
    private String creationDate;
}
