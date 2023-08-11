package com.example.product;

import com.example.product.hone.product.ProductService;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MakketServiceTest {
    @Autowired
    private  ProductService productService;
    @Test
    @DisplayName("강의제품 생성")
    void test1(){

    }
}
