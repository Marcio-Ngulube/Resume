package com.example.sslserver.view;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table( name="Acess")
public class Acess {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_do_Acess;

    private int acess_times=0;
    private String acess_info="";

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Acess() {
    }

    public Acess(Long id_do_Acess, int acess_times, String acess_info) {
        this.id_do_Acess = id_do_Acess;
        this.acess_times = acess_times;
        this.acess_info = acess_info;
    }

    public Long getId_do_Acess() {
        return id_do_Acess;
    }

    public void setId_do_Acess(Long id_do_Acess) {
        this.id_do_Acess = id_do_Acess;
    }

    public int getAcess_times() {
        return acess_times;
    }

    public void setAcess_times(int acess_times) {
        this.acess_times = acess_times;
    }

    public String getAcess_info() {
        return acess_info;
    }

    public void setAcess_info(String acess_info) {
        this.acess_info = acess_info;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
