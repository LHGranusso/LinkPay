package com.linkpay.service;

import com.linkpay.model.carteira;

import java.math.BigDecimal;
import java.util.ArrayList;

public class carteiraService {

    public ArrayList<carteira> carteiras;

    public boolean addCarteira(int carteira, BigDecimal valor){
        for (carteira c : carteiras){
            if (c.getId() == carteira){
                c.setSaldo(c.getSaldo().add(valor));
            }
        }
        return true;
    }
}
