package com.tas_payment.dto;

import lombok.Data;

@Data
public class MerchantPaymentRequest {
    private String trade_no;
    private String merchant_no;
    private String remark;
    private int total_amount;
    private String currency;
    private String address;
    private String redirect_url;
    private String notify_url;
    private String nonce;
    private String hash;
    private String request_time;
}
