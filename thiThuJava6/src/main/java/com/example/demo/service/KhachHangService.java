package com.example.demo.service;

import com.example.demo.dto.KhacHangCustom;
import com.example.demo.dto.KhachHangRequest;
import com.example.demo.entity.KhachHang;
import com.example.demo.reponsitory.KhacHangReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService {
    @Autowired
    private KhacHangReponsitory reponsitory;

    public List<KhacHangCustom> getAll() {
        return reponsitory.getKhachHangAll();
    }

    public Page<KhachHang> getAll(Integer page) {
        Pageable pageable = PageRequest.of(page, 1);
        return reponsitory.findAll(pageable);
    }

    public KhachHang add(KhachHangRequest request) {
        KhachHang khs = request.map(new KhachHang());
        return reponsitory.save(khs);
    }

    public KhachHang delete(Long ma){
        Optional<KhachHang> optional = reponsitory.findById(ma);
        return optional.map(o-> {
            reponsitory.delete(o);
            return o;
        }).orElse(null);

    }
}
