
/*
.This class has to do with repository methods including crud operations
.After a method is used a return is included redirect after a PUT or a POST to prevent a refresh of the page
 that would re-trigger the operation
*/

package com.java2.multifunctional.Controllers;
import com.java2.multifunctional.entities.Products;
import com.java2.multifunctional.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // GetMapping or @PostMapping are shortcuts for RequestMapping method = RequestMethod.GET, method = RequestMethod.POST
    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "1") int page) {
        model.addAttribute("data", productRepository.findAll(PageRequest.of(page, 4)));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @GetMapping("/hoteli")
    public String showpage(Model model) {
        return "hoteli";
    }
    // Save a new product or update it
    @PostMapping("/save")
    public String save(Products product) {
        productRepository.save(product);
        return "redirect:/";
    }
    // Delete an existing product
    @GetMapping("/delete")
    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "redirect:/";
    }

    // Find one product by id
    @GetMapping("/findOne")
    @ResponseBody
    public Products findOne(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
