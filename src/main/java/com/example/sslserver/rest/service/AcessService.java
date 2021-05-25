package com.example.sslserver.rest.service;

import com.example.sslserver.view.Acess;

import java.util.List;

public interface AcessService {

    List<Acess> retrieveAcess();
    int retrieveAcessTimes();
    int incrementAcess ();
    int saveAcess(Acess acess);

}


