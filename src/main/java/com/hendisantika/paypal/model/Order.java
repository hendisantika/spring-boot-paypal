package com.hendisantika.paypal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-paypal
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/07/21
 * Time: 12.35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private double price;
    private String currency;
    private String method;
    private String intent;
    private String description;
}
