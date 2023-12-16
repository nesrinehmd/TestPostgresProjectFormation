package com.testproject.testproject.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

//import javax.persistence.Table;

@Data
@AllArgsConstructor
@EntityScan
// @Table(name = "client")
public class client {

    @Id
    public String CodeClient;

    public String NomClient;
    public String AdresseClient;

}
