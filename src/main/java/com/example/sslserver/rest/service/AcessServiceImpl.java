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
        int acess_times=acessRepository.retrieveAcessTimes();
       if( acess_times == 1) {
        Acess acess=new Acess();
        acess.setId_do_Acess((long)1);
        acess.setAcess_times(1);
        saveAcess(acess);
       }
        return acess_times;
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
