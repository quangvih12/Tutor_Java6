package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "HangKhachHang")
public class HangKhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaHang")
    private Integer ma;

    @Column(name = "TenHang")
    private String ten;
}
