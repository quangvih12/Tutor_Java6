//package com.example.demo.buoi3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class MayTinhService {
//
//    @Autowired
//    private MayTinhReponsitory mayTinhReponsitory;
//
//    public Page<MayTinh> getAll(Integer page) {
//        Pageable pageable = PageRequest.of(page, 5);
//        return mayTinhReponsitory.findAll(pageable);
//    }
//
//    public MayTinh getOne(String ma) {
//        Optional<MayTinh> optional = mayTinhReponsitory.findById(ma);
//        return optional.isPresent() ? optional.get() : null;
//    }
//
//    public MayTinh update(MayTinh mayTinh, String ma) {
//        Optional<MayTinh> optional = mayTinhReponsitory.findById(ma);
//        return optional.map(o -> {
//            o.setTen(mayTinh.getTen());
//            o.setMauSac(mayTinh.getMauSac());
//            o.setMieuTa(mayTinh.getMieuTa());
//            o.setHang(mayTinh.getHang());
//            o.setBoNho(mayTinh.getBoNho());
//            o.setGia(mayTinh.getGia());
//            return mayTinhReponsitory.save(o);
//        }).orElse(null);
//    }
//
//    public MayTinh delete(String ma) {
//        Optional<MayTinh> optional = mayTinhReponsitory.findById(ma);
//        return optional.map(o -> {
//            mayTinhReponsitory.delete(o);
//            return o;
//        }).orElse(null);
//    }
//
//    public List<MayTinh> loc(){
//        return mayTinhReponsitory.findAll().stream()
//                .filter(o-> o.getGia() >=1&& o.getGia()<= 2000)
//                .collect(Collectors.toList());
//    }
//
//    public MayTinh max(){
//        return  mayTinhReponsitory.findAll().stream()
//                .max(Comparator.comparing(MayTinh::getGia))
//                .get();
//    }
//
//    public Integer tong(){
//        return (int)  mayTinhReponsitory.findAll().stream()
//                .filter(o-> o.getHang().equals("dell"))
//                .count();
//    }
//}
