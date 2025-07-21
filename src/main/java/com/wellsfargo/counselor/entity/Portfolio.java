package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    

    protected Portfolio() {

    }

    public Portfolio(long clientId, LocalDateTime createdAt) {
        this.clientId = clientId;
        this.createdAt = createdAt;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public long getclientId() {
        return clientId;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
