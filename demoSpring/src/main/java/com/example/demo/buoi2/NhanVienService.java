package com.example.demo.buoi2;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class NhanVienService {

    private List<NhanVien> list = new ArrayList<>();

    @PostConstruct
    public void fakeData(){
        IntStream.rangeClosed(1,50)
                .mapToObj(o-> NhanVien.builder().ten("name "+o).tuoi(new Random().nextInt(50)).luong(new Random().nextInt(5000)).build())
                .forEach(list::add);
    }

    public  List<NhanVien> getAll(){
        return list;
    }

    public List<NhanVien> loc(){
        return  list.stream()
                .filter(o-> o.getTuoi()>= 25 && o.getTuoi() <= 35 && o.getLuong() > 1000)
                .collect(Collectors.toList());
    }

    public Optional<NhanVien> luongCaoNhat(){
        return  list.stream().max(Comparator.comparing(NhanVien::getLuong));
    }

    public List<NhanVien> sort(){
        list.sort(Comparator.comparing(NhanVien::getLuong,Comparator.reverseOrder()));
        return list;
    }

}
