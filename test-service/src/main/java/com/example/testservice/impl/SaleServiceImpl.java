package com.example.testservice.impl;

import com.example.testapi.service.service.SaleService;
import org.springframework.stereotype.Service;
/*
* 卖接口的实现类
* */
@Service("saleService")
public class SaleServiceImpl implements SaleService {
    @Override
    public String findProductPriceById(String id) {
        return "30元";
    }
}
