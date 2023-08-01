package com.example.demo;


import java.util.*;
import java.util.stream.Collectors;

//class Product {
//    String ten;
//    float giaBan;
//
//    public Product(String ten, float giaBan) {
//        this.ten = ten;
//        this.giaBan = giaBan;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public float getGiaBan() {
//        return giaBan;
//    }
//
//    public void setGiaBan(float giaBan) {
//        this.giaBan = giaBan;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "ten='" + ten + '\'' +
//                ", giaBan=" + giaBan +
//                '}';
//    }
//}


public class demoStream {
    //    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(2, 4, 5, 3, 1);
//
//        // tinh tong so chan
//        int sum = list.stream().filter(o -> o % 2 == 0).reduce(0, (o1, o2) -> o1 + o2);
//        System.out.println(sum);
//
//        // tinh tich so le
//        int tich = list.stream().filter(o -> o % 2 != 0).reduce(1, (o1, o2) -> o1 * o2);
//        System.out.println(tich);
//
//        // tinh tong binh phuong cac so le
//        int agv = list.stream().filter(o -> o % 2 != 0).reduce(0, (o1, o2) -> o1 + o2) / (int) list.stream().filter(o -> o % 2 != 0).count();
//        System.out.println(agv);
//    }
//    public static void main(String[] args) {
//        List<Product> list = new ArrayList<Product>();
//        list.add(new Product("ten 1", 2000));
//        list.add(new Product("ten 2", 5000));
//        list.add(new Product("ten 3", 6000));
//        list.add(new Product("ten 4", 10000));
//
//        // loc san pham theo khoang gia
//        list.stream().filter(o -> o.giaBan >= 2000 && o.giaBan <= 6000).forEach(System.out::println);
//
//        // tinh tong gia ban tat ca san pham
//        float sum = list.stream().map(o -> o.giaBan).reduce(0f, Float::sum);
//        System.out.println(sum);
//
//        // tim san pham co gia ban co nhat
//        //C1:
//        Product product = list.stream().max((o1, o2) -> o1.giaBan > o2.giaBan ? 1 : -1).get();
//        System.out.println(product);
//        //C2:
//        Optional<Product> products = list.stream()
//                .max(Comparator.comparing(Product::getGiaBan));
//        products.ifPresent(o -> System.out.println(o.toString()));
//
//        // tinh trung binh cong
//        float agv = list.stream().map(o -> o.giaBan).reduce(1f, (o1, o2) -> o1 + o2) / list.size();
//        System.out.println(agv);
//
//
//        // demo sorted
//        List names = Arrays.asList("Reflection","Collection","Stream");
//        List result = (List) names.stream().sorted().collect(Collectors.toList());
//        result.forEach(o -> System.out.println(o));
//    }

}
