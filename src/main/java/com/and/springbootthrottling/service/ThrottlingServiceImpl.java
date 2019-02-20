package com.and.springbootthrottling.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ThrottlingServiceImpl implements ThrottlingService {

    @Override
    public List<String> getAll() {
        return Arrays.asList("a","b","c");
    }
}
