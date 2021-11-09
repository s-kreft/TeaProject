package com.example.tea;

import org.springframework.stereotype.Service;

@Service
public class TeaService {
    public Tea getTea() {
        Tea tea = new Tea("Yunnan", "Green", 35.5);
        return tea;
    }
}
