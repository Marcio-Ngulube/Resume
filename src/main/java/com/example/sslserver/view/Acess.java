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
    private Long idDoAccess;

    private int accessTimes;
    private String accessInfo;



    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public Long getIdDoAccess() {
        return idDoAccess;
    }

    public void setIdDoAccess(Long idDoAccess) {
        this.idDoAccess = idDoAccess;
    }

    public int getAccessTimes() {
        return accessTimes;
    }

    public void setAccessTimes(int accessTimes) {
        this.accessTimes = accessTimes;
    }

    public String getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(String accessInfo) {
        this.accessInfo = accessInfo;
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
