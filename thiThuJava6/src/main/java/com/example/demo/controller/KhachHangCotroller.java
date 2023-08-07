package com.example.demo.controller;

import com.example.demo.dto.KhachHangRequest;
import com.example.demo.service.KhachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khachHang")
public class KhachHangCotroller {

    @Autowired
    private KhachHangService service;

    @GetMapping()
    public ResponseEntity<?> getAll(){
        return  ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(@RequestParam(defaultValue = "0", name = "page") Integer page){
        return  ResponseEntity.ok(service.getAll(page));
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid KhachHangRequest request, BindingResult result){
        if(result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            return ResponseEntity.ok(list);
        }else {
            return  ResponseEntity.ok(service.add(request));
        }
    }

    @DeleteMapping("/delete/{ma}")
    public ResponseEntity<?> Delete(@PathVariable Long ma){
        return  ResponseEntity.ok(service.delete(ma));
    }

}
