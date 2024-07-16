package com.example.nnt_project.entity;

import com.example.nnt_project.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Driver extends AbsEntity {

    private String driverName;
    private String driverPhone;
    private String driverEmail;

    @OneToOne
    private Address address;

    private  String zipCode;
    private boolean licenceNo;
    private Timestamp DateOfBirth;

    @ManyToOne
    private Truck truck;
}
