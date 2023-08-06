package com.example.demo.Buoi4.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NSX")
public class NhaSanXuat {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "Ten")
    private String ten;
}
