package com.example.sslserver.rest.service;

import com.example.sslserver.rest.repository.AcessRepository;
import com.example.sslserver.view.Acess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
class AcessServiceImplTest {

    @Mock
    AcessRepository acessRepository;

    @InjectMocks
     AcessServiceImpl acessServiceImpl;

    @Mock
    Acess acess;

    @BeforeEach
    void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void retrieveAcess() {

        List <Acess> acessList= new ArrayList<>();
        acessList.add(acess);
        given(acessRepository.retrieveAcess()).willReturn(acessList);

        assertEquals(acessList,acessServiceImpl.retrieveAcess());

    }

    @Test
    void retrieveAcessTimes() {

        given(acessRepository.retrieveAcessTimes()).willReturn(1);
        given(acessRepository.findOne((long)5)).willReturn(acess);
        given(acessRepository.save(acess)).willAnswer(invocation -> invocation.getArguments()[0]);

        if(acessRepository.retrieveAcessTimes() == 1){
            acessServiceImpl.saveAcess(acess);
        } 
            
        assertNotEquals(0,acessServiceImpl.retrieveAcessTimes());
        assertEquals(1,acessServiceImpl.retrieveAcessTimes());

    }

    @Test
     void incrementAcess() {

        given(acessRepository.incrementAcess()).willReturn(0);
        given(acessRepository.retrieveAcessTimes()).willReturn(1);
        
        int saveAcess = acessServiceImpl.incrementAcess();

        assertEquals(1, saveAcess);
        assertEquals(0,verify(acessRepository).incrementAcess());

    }

    @Test
    void saveAcess() {

        given(acessRepository.findOne((long)5)).willReturn(acess);
        given(acessRepository.save(acess)).willAnswer(invocation -> invocation.getArguments()[0]);

        int saveAcess = acessServiceImpl.saveAcess(acess);

        assertEquals(0, saveAcess);
        verify(acessRepository).save(any(Acess.class));
    }
}