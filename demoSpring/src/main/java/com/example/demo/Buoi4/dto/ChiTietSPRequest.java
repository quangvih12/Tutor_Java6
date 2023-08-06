package com.example.demo.Buoi4.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ChiTietSPRequest {


    private String idSp;

    private String idNSX;

    private Integer namBH;

    private Integer soLuongTon;

    private String moTa;

    private BigDecimal giaNhap;

    private BigDecimal giaBan;
}
