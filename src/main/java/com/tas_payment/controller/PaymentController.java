package com.tas_payment.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1.0")
public class PaymentController {

    /**
     * MerchantRequest
     * Header:
     * merchant_no
     * key
     * hash
     *
     * Request Body:
     * trade_no
     * total_amount
     * currency
     * request_time
     * redirect_url
     * notify_url
     * random_id
     * request_address
     * note
     *
     * key & hash
     * 每個merchant有一個獨立的key
     * 根據當下交易內容簽出一個hash
     * hash:
     * 以merchant_no|請求時間(yyyy:MM:dd HH:mm:ss)|trade_no|random_id
     * Redirect_url
     * ?redirect_time=yyyyMMddHHmmss&trade_no=XXX&transaction_id=XXX&status=XXX&errorCode=XXX&errorMessage=XXX
     */

}
