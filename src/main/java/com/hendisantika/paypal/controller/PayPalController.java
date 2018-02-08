package com.hendisantika.paypal.controller;

import com.hendisantika.paypal.client.PayPalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-paypal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/02/18
 * Time: 06.48
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping(value = "/paypal")
public class PayPalController {

    private final PayPalClient payPalClient;

    @Autowired
    PayPalController(PayPalClient payPalClient) {
        this.payPalClient = payPalClient;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/make/payment")
    public Map<String, Object> makePayment(@RequestParam("sum") String sum) {
        return payPalClient.createPayment(sum);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/complete/payment")
    public Map<String, Object> completePayment(HttpServletRequest request, @RequestParam("paymentId") String paymentId, @RequestParam("payerId") String payerId) {
        return payPalClient.completePayment(request);
    }

}
