
// The main class when application start these two methods load first.
package com.java2.multifunctional;

import com.java2.multifunctional.entities.Products;
import com.java2.multifunctional.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        // Added some products manually
            productRepository.save(new Products("Kika","Fabrika e ujit ne kike","Water",0.20));
            productRepository.save(new Products("Miros","Uji Magjik","Uje",0.39));
            productRepository.save(new Products("Rugova","Rugove","Uje",0.22));
            productRepository.save(new Products("Spring","Spring-Alb","Uje",0.10));
            productRepository.save(new Products("Dea","Rc-Cola","Uje",0.40));
    }
}
