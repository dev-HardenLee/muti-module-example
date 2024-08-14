package org.example.moduleapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(apiService.getText());
    }

}
