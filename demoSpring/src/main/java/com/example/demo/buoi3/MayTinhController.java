//package com.example.demo.buoi3;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/mayTinh")
//public class MayTinhController {
//    @Autowired
//    private MayTinhService mayTinhService;
//
//    @GetMapping()
//    public ResponseEntity<?> getAll(@RequestParam(defaultValue = "0", value = "page") Integer page) {
//        return ResponseEntity.ok(mayTinhService.getAll(page));
//    }
//
//    @GetMapping("/detail/{ma}")
//    public ResponseEntity<?> getOne(@PathVariable String ma) {
//        return ResponseEntity.ok(mayTinhService.getOne(ma));
//    }
//
//    @PutMapping("/update/{ma}")
//    public ResponseEntity<?> update(@PathVariable String ma, @RequestBody MayTinh mayTinh) {
//        return ResponseEntity.ok(mayTinhService.update(mayTinh,ma));
//    }
//
//    @DeleteMapping("/delete/{ma}")
//    public ResponseEntity<?> delete(@PathVariable String ma) {
//        return ResponseEntity.ok(mayTinhService.delete(ma));
//    }
//
//    @GetMapping("/loc")
//    public ResponseEntity<?> loc() {
//        return ResponseEntity.ok(mayTinhService.loc());
//    }
//
//    @GetMapping("/max")
//    public ResponseEntity<?> max() {
//        return ResponseEntity.ok(mayTinhService.max());
//    }
//
//    @GetMapping("/tong")
//    public ResponseEntity<?> tong() {
//        return ResponseEntity.ok(mayTinhService.tong());
//    }
//}
