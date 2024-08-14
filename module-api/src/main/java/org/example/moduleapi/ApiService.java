package org.example.moduleapi;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import org.example.modulecore.CoreRepository;

@Service
@RequiredArgsConstructor
public class ApiService {

    private final CoreRepository coreRepository;

    public String getText() {
        return coreRepository.test();
    }

}
