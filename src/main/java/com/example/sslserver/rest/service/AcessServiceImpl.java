package com.example.sslserver.rest.service;

import com.example.sslserver.rest.repository.AcessRepository;
import com.example.sslserver.view.Acess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessServiceImpl implements AcessService{

    @Autowired
    AcessRepository acessRepository;

    @Override
    public List<Acess> retrieveAcess() {
        return acessRepository.retrieveAcess();
    }

    @Override
    public int retrieveAcessTimes() {
        int acessTimes=acessRepository.retrieveAcessTimes();
       if( acessTimes == 1) {
        Acess acess=new Acess();
        acess.setIdDoAccess((long)1);
        acess.setAccessTimes(1);
        saveAcess(acess);
       }
        return acessTimes;
    }

    @Override
    public int incrementAcess() {
         acessRepository.incrementAcess();
         return retrieveAcessTimes();
    }

    @Override
    public int saveAcess(Acess acess) {
        acessRepository.save(acess);
        return 0;
    }
}
