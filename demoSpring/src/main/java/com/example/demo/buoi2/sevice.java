package com.example.demo.buoi2;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class sevice {

  // private List<Product> list = new ArrayList<>();


    public void getAll(List<Product> list ) {
        IntStream.rangeClosed(1, 10).mapToObj(o -> new Product("name " + o, new Random().nextInt(30))).forEach(list::add);
    }
    public  List<Product> getLisst(List<Product> list){
        return list;
    }


    public List<Product> loc(List<Product> list) {
        return list.stream().filter(o -> o.getGiaBan() >= 1 && o.getGiaBan() <= 10 && o.getTen().contains("e")).collect(Collectors.toList());
    }
//
    public Float sum(List<Product> list) {
        return list.stream().map(product -> product.getGiaBan()).reduce(0f, Float::sum);
    }
//
    public void sort(List<Product> list) {
        list.sort(Comparator.comparing(Product::getGiaBan));

    }


    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        new sevice().getAll(list);

        new sevice().sort(list);
        new sevice().getLisst(list).forEach(System.out::println);
// new sevice().loc().forEach(System.out::println);


    }
}
