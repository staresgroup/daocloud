package com.example.daocloud;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
