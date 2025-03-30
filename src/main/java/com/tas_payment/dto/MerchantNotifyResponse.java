package com.tas_payment.dto;

import lombok.Data;

@Data
public class MerchantNotifyResponse {
    private String merchant_no;
    private String merchant_name;
    private String transaction_id;
    private String transaction_type;
    private int total_amount;
    private String currency;
    private String status;
    private String error_code;
    private String error_message;
    private String response_time;
    private String trade_no;
    private String request_time;
    private String hash;
}
