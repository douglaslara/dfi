package com.ubs.gcrg.cto.dfi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class DataFlow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String sourceApplication;

    String targetApplication;


}
