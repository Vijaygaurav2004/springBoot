package dev.vijay.sprig.controller;

import dev.vijay.sprig.dto.fakestore;
import dev.vijay.sprig.models.Cart;
import dev.vijay.sprig.service.cartservice;
import org.springframework.web.bind.annotation.*;
import dev.vijay.sprig.service.Cartclasses;

@RestController
public class cartcontroller {

    cartservice ps;
    cartcontroller(cartservice ps){
        this.ps = ps;
    }
    @GetMapping("/carts")
    public fakestore[] getallproducts(){

        return ps.getallproducts();
    }

    @GetMapping("/carts/{id}")
    public fakestore getproductsbyId(@PathVariable Long id){

        return ps.getproductsbyId(id);
    }

//    @GetMapping("/dateRange")
//    public fakestore betweenDateRange(@RequestParam("from") String start, @RequestParam("to") String end) {
//        return ps.inDateRange(start, end);
//    }
//   @PostMapping("/products")
//   public fakestore[] createproduct(@RequestBody fakestore product){
//        return ps.createproduct(product);
//   }

   @DeleteMapping("/delete/{id}")
        public String deleteproduct(@PathVariable Long id){
        ps.deleteproduct(id);
        return "Product deleted succesfully";
  }

//  @PostMapping("/add")
//    public String addcart(@RequestBody Cart cart){
//        return ps.addcart(cart);
//  }
}
