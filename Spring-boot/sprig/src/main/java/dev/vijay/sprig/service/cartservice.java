package dev.vijay.sprig.service;

import dev.vijay.sprig.dto.fakestore;
import dev.vijay.sprig.models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class cartservice {

    RestTemplate restemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public fakestore getproductsbyId(Long id) {
        fakestore response = restemplate.getForObject(url + "/carts/" + id, fakestore.class);
        return response;
    }

    public fakestore[] getallproducts() {
        fakestore[] response = restemplate.getForObject(url + "/carts", fakestore[].class);
        return response;
    }

    public Cart[] getcategories() {
        Cart[] response = restemplate.getForObject(url + "/categories", Cart[].class);
        return response;
    }

//    public fakestore[] createproduct(fakestore product){
//        fakestore storeproduct =  new fakestore();
//        storeproduct.setId(product.getId());
//        storeproduct.setTitle(product.getTitle());
//        storeproduct.setPrice(product.getPrice());
//        storeproduct.setDescription(product.getDescription());


    //        fakestore[] result=restemplate.postForObject(url + "/products",storeproduct,fakestore[].class);
//        System.out.println("create");
//        return result;
//    }
    public void deleteproduct(Long id) {
        restemplate.delete(url + "/delete/" + id, fakestore.class);
    }
}

//    public fakestore addCart(fakestore cart) {
//       fakestore sendCart = mapToCardDTO(cart);
//        sendCart = restemplate.postForObject(url, sendCart, fakestore.class);
//
//
//        return sendCart;
//    }