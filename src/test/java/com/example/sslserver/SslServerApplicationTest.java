package com.example.sslserver;

import com.example.sslserver.controler.AcessController;
import com.example.sslserver.rest.repository.AcessRepository;
import com.example.sslserver.rest.service.AcessServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class SslServerApplicationTest {


    @Test
    void contextLoads(){
    }

}