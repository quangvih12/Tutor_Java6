package com.example.demo.buoi2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nhanVien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping()
    public ResponseEntity<?> getAll(){
        List<NhanVien> list = nhanVienService.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/loc")
    public ResponseEntity<?> loc(){
        List<NhanVien> list = nhanVienService.loc();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/luongCaNhat")
    public ResponseEntity<?> luongCaNhat(){
        Optional<NhanVien> op = nhanVienService.luongCaoNhat();
        return ResponseEntity.ok(op);
    }

    @GetMapping("/sort")
    public ResponseEntity<?> sort(){
        List<NhanVien> list = nhanVienService.sort();
        return ResponseEntity.ok(list);
    }
}
