package com.tas_payment.dto;

import lombok.Data;

@Data
public class MerchantPaymentResponse {
    private String trade_no;
    private String merchant_no;
    private int total_amount;
    private String return_url;
    private String nonce;
    private String hash;
    private String request_time;
}
