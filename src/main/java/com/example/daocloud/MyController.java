package com.example.daocloud;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.daocloud.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/")
    public String index() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/add")
    public String add(int firstNum, int secondNum) {

        return myService.add(firstNum, secondNum) + "s ";
    }

    @GetMapping("/products")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public String getProducts() {
        return myService.getProducts();
    }
}
