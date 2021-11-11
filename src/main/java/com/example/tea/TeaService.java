package com.example.tea;

import org.springframework.stereotype.Service;

@Service
public class TeaService {
    public String getItemList() {
        Tea herbata1 = new Tea("Zao Chun", TeaType.GREEN, "Yunnan", 35.5 );

        return herbata1.toString();
    }
}
