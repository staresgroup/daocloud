package com.example.daocloud;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public String getProducts() {
        return "{\"products\":[{\"id\":1,\"quantity\":1,\"name\":\"Compass\"},{\"id\":2,\"quantity\":0,\"name\":\"Jacket\"},{\"id\":3,\"quantity\":5,\"name\":\"Hiking Socks\"},{\"id\":4,\"quantity\":2,\"name\":\"Suntan Lotion\"}]}";
    }
}
