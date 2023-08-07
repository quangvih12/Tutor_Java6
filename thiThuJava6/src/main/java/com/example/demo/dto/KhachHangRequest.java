package com.example.demo.dto;

import com.example.demo.entity.HangKhachHang;
import com.example.demo.entity.KhachHang;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KhachHangRequest {

    @NotBlank(message = "ma hang khong dc de trong")
    private String maHang;


    private String sdt;

    private String gioiTinh;

    private String ten;

    public KhachHang map(KhachHang kh){
        kh.setSdt(this.getSdt());
        kh.setTen(this.getTen());
        kh.setGioiTinh(Boolean.valueOf(this.getGioiTinh()));
        kh.setHangKhachHang(HangKhachHang.builder().ma(Integer.valueOf(maHang)).build());
        return kh;
    }
}
