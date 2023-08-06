package com.example.demo.Buoi4.reponsitory;

import com.example.demo.Buoi4.dto.ChiTietSPCusTom;
import com.example.demo.Buoi4.entity.ChiTietSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietSPReponsitory extends JpaRepository<ChiTietSanPham, String> {

    @Query(value = "select sp.Ma, nsx.Ten,ctsp.NamBH,ctsp.MoTa, ctsp.SoLuongTon,ctsp.GiaNhap, ctsp.GiaBan \n" +
            "from ChiTietSP ctsp \n" +
            "join SanPham sp on sp.Id = ctsp.IdSP \n" +
            "join NSX nsx on nsx.id = ctsp.IdNsx", nativeQuery = true)
    List<ChiTietSPCusTom> getCusTomSanPham();

}
