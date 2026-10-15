package com.linkpay.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class carteira {

    private int id;

    private BigDecimal saldo;
}
