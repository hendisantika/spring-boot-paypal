package com.hendisantika.paypal.controller;

import com.hendisantika.paypal.service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-paypal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/07/21
 * Time: 12.47
 */
@Controller
public class Paypal2Controller {
    public static final String SUCCESS_URL = "pay/success";
    public static final String CANCEL_URL = "pay/cancel";
    @Autowired
    PaypalService service;
}
