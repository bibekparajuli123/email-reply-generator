package com.email.email.writer.controller;

import com.email.email.writer.entity.EmailRequestEntity;
import com.email.email.writer.service.EmailResponseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailResponseController {
    private final EmailResponseService service;
    @PostMapping("/generate")
    ResponseEntity<String> generateEmail(@RequestBody EmailRequestEntity emailRequestEntity){
        String response = service.generateEmailReply(emailRequestEntity);
        return ResponseEntity.ok(response);
    }
}
