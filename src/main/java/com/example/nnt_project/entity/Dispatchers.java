package com.example.nnt_project.entity;

import com.example.nnt_project.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dispatchers {

    @Id
    @GeneratedValue
    private UUID id;

    private int numberOfLoads;
    private double grossRevenue;
    private double netProfit;
    private int openLoads;
    private String phoneNumber;

    private UUID userId;
}
