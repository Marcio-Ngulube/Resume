package com.example.sslserver.rest.repository;

import com.example.sslserver.view.Acess;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AcessRepository extends CrudRepository<Acess, Long> {


    @Query("select '*' from Acess d")
    List<Acess> retrieveAcess();


    @Query("select coalesce( MAX(d.accessTimes) ,1) AS acesstime from Acess d")
    int retrieveAcessTimes();

    @Transactional
    @Modifying
    @Query("update Acess set accessTimes = accessTimes+1")
    int incrementAcess ();

}
