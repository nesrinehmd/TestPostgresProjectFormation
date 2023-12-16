package com.testproject.testproject.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@EntityScan
public class produit {

    @Id
    public String RefProduit;

    public String DesignationProduit;
    public int PrixUnitaireProduit;

}
