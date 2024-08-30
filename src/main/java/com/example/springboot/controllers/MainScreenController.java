package com.example.springboot.controllers;

import com.example.springboot.domain.Part;
import com.example.springboot.domain.Product;
import com.example.springboot.service.PartService;
import com.example.springboot.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MainScreenController {


    private PartService partService;
    private ProductService productService;

    private List<Part> theParts;
    private List<Product> theProducts;


    public MainScreenController(PartService partService, ProductService productService){
        this.partService=partService;
        this.productService=productService;
    }
    @SuppressWarnings("SameReturnValue")
    @GetMapping("/mainscreen")
    public String listPartsandProducts(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
        //add to the sprig model
        List<Part> partList=partService.listAll(partkeyword);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);

        List<Product> productList=productService.listAll(productkeyword);
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword",productkeyword);
        return "mainscreen";
    }

    @SuppressWarnings("SameReturnValue")
    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
