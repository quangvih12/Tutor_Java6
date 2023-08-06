package com.example.demo.Buoi4.service;

import com.example.demo.Buoi4.dto.ChiTietSPCusTom;
import com.example.demo.Buoi4.dto.ChiTietSPRequest;
import com.example.demo.Buoi4.entity.ChiTietSanPham;
import com.example.demo.Buoi4.entity.NhaSanXuat;
import com.example.demo.Buoi4.entity.SanPham;
import com.example.demo.Buoi4.reponsitory.ChiTietSPReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChiTietSPService {

    @Autowired
    private ChiTietSPReponsitory chiTietSPReponsitory;

    public List<ChiTietSPCusTom> getAll() {
        return chiTietSPReponsitory.getCusTomSanPham();
    }

    public ChiTietSanPham getOne(String ma) {
        Optional<ChiTietSanPham> optional = chiTietSPReponsitory.findById(ma);
        return optional.isPresent() ? optional.get() : null;
    }

    public ChiTietSanPham update(String ma, ChiTietSPRequest request) {
        Optional<ChiTietSanPham> optional = chiTietSPReponsitory.findById(ma);

        return optional.map(chiTietSanPham -> {
            chiTietSanPham.setSanPham(SanPham.builder().id(request.getIdSp()).build());
            chiTietSanPham.setNhaSX(NhaSanXuat.builder().id(request.getIdNSX()).build());
            chiTietSanPham.setGiaBan(request.getGiaBan());
            chiTietSanPham.setGiaNhap(request.getGiaNhap());
            chiTietSanPham.setMoTa(request.getMoTa());
            chiTietSanPham.setSoLuongTon(request.getSoLuongTon());
            chiTietSanPham.setNamBH(request.getNamBH());
            return chiTietSPReponsitory.save(chiTietSanPham);
        }).orElse(null);
    }

    public ChiTietSanPham delete(String ma) {
        Optional<ChiTietSanPham> optional = chiTietSPReponsitory.findById(ma);
        return optional.map(chiTietSanPham -> {
            chiTietSPReponsitory.delete(chiTietSanPham);
            return chiTietSanPham;
        }).orElse(null);
    }

}
