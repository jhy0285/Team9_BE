package com.kakao.linknamu.test;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @PostMapping("/submit")
    public ResponseEntity<?> submit(@RequestBody @Valid dto test, Errors errors) {
        // 요청 처리 로직
        return ResponseEntity.ok("Request accepted");
    }
}
