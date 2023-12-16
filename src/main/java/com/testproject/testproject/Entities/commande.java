package com.testproject.testproject.Entities;

import java.sql.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@EntityScan
public class commande {

    @Id
    public int NumeroCommande;

    public Date DateCommande;
    public int QuantiteCommandee;

}
