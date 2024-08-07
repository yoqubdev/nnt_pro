package com.example.nnt_project.entity;

import com.example.nnt_project.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Truck extends AbsEntity {
    private String truckNumber;
    private String truckType;
    private String licencePlate;
    private Timestamp plateExpiry;
    private String description;
    private Boolean active;
    private boolean ownershipIsPrivate;
}
