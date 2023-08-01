package com.example.demo.buoi1;

import java.util.*;

//class Product {
//    private String ten;
//    private float gia;
//
//    public Product() {
//    }
//
//    public Product(String ten, float gia) {
//        this.ten = ten;
//        this.gia = gia;
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
//    public float getGia() {
//        return gia;
//    }
//
//    public void setGia(float gia) {
//        this.gia = gia;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "ten='" + ten + '\'' +
//                ", gia=" + gia +
//                '}';
//    }
//}
class HocSinh{
    private String ten;
    private Integer diem;

    public HocSinh() {
    }

    public HocSinh(String ten, Integer diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", diem=" + diem +
                '}';
    }
}
public class Demo {

    public static void main(String[] args) {
        List<HocSinh> list = new ArrayList<>();
        list.add(new HocSinh("ten 1", 8));
        list.add(new HocSinh("ten 2", 9));
        list.add(new HocSinh("ten 3", 10));
        list.add(new HocSinh("ten 4", 7));

        list.stream().filter(o-> o.getDiem() >= 8).forEach(System.out::println);

        float agv = list.stream().map(HocSinh::getDiem).reduce(0,Integer::sum)/ list.size();
        System.out.println(agv);

        Optional<HocSinh> optional = list.stream().max(Comparator.comparing(HocSinh::getDiem));
        optional.ifPresent(o-> System.out.println(o.toString()));
    }





//    public static void main(String[] args) {
//        List<Product> list = new ArrayList<>();
//        list.add(new Product("ten 1", 200));
//        list.add(new Product("ten 2", 300));
//        list.add(new Product("ten 3", 10));
//        list.add(new Product("ten 4", 20));
//
////        for (Product o: list) {
////            if(o.getGia() >= 12&& o.getGia() <= 201){
////                System.out.println(o.toString());
////            }
////        }
//        list.stream().filter(o -> o.getGia() >= 12 && o.getGia() <= 201).forEach(System.out::println);
//
//        float sum = list.stream().map(o -> o.getGia()).reduce(0f, Float::sum);
//        System.out.println("sum: " + sum);
//
//        // c1:
//        Product product = list.stream().max((o1,o2)-> o1.getGia() > o2.getGia() ? 1 : -1).get();
//        System.out.println("san pham max "+product);
//
//        // c2
//        Optional<Product> optional = list.stream().max(Comparator.comparing(Product::getGia));
//        optional.ifPresent(o -> System.out.println(o.toString()));
//    }


//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 3, 4, 5, 7);
//        int sum = 0;
////        for (Integer i : list) {
////          if(i %2==0){
////              sum += i;
////          }
////        }
////        System.out.println(sum);
//
//        // stream
//        int sums = list.stream().filter(o -> o % 2 == 0).reduce(0, Integer::sum);
//        System.out.println("sum " + sums);
//
//        int tich = 1;
//        for (Integer i : list) {
//            if (i % 2 != 0) {
//                tich *= i;
//            }
//        }
//        System.out.println("tich: " + tich);
//
//        // stream
//        int tichs = list.stream().filter(o -> o % 2 != 0).reduce(1, (o1, o2) -> o1 * o2);
//        System.out.println("tich tream: " + tichs);
//
//        int agv = list.stream().filter(o -> o % 2 != 0).reduce(0, (o1, o2) -> o1 + o2 * o2);
//        int agvs = list.stream().filter(o -> o % 2 != 0).reduce(0, (o1, o2) -> o1 + o2)
//                    / (int) list.stream().filter(o -> o % 2 != 0).count();
//        System.out.println("tong binh phuong: " + agv);
//        System.out.println("trung binh cong: " + agvs);
//    }

}
