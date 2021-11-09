package com.example.tea;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaRestController {
    private TeaService teaService;

    public TeaRestController(TeaService teaService) {
        this.teaService = teaService;
    }
    @GetMapping("/tea")
    public ResponseEntity returnTeaType() {
        return ResponseEntity.ok(teaService.getTea());
    }

}
