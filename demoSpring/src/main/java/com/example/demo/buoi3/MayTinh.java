//package com.example.demo.buoi3;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.GenericGenerator;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "may_tinh")
//public class MayTinh {
//
//    @Id
//    @GenericGenerator(name = "gennerator", strategy = "guid", parameters = {})
//    @GeneratedValue(generator = "gennerator")
//    @Column(name = "ma")
//    private String ma;
//
//    @Column(name = "ten")
//    private String ten;
//
//    @Column(name = "gia")
//    private Float gia;
//
//    @Column(name = "bo_nho")
//    private String boNho;
//
//    @Column(name = "mau_sac")
//    private String mauSac;
//
//    @Column(name = "hang")
//    private String hang;
//
//    @Column(name = "mieu_ta")
//    private String mieuTa;
//}
