package com.example.springboot.bootstrap;

import com.example.springboot.domain.InhousePart;
import com.example.springboot.domain.OutsourcedPart;
import com.example.springboot.domain.Product;
import com.example.springboot.repositories.InhousePartRepository;
import com.example.springboot.repositories.OutsourcedPartRepository;
import com.example.springboot.repositories.PartRepository;
import com.example.springboot.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear existing data to prevent duplicates
        inhousePartRepository.deleteAll();
        outsourcedPartRepository.deleteAll();
        productRepository.deleteAll();

        // In-house parts
        InhousePart ip1 = new InhousePart();
        ip1.setId(901);
        ip1.setName("Smartphone Screen");
        ip1.setPrice(5.00);
        ip1.setInv(10);
        ip1.setMinInv(1);
        ip1.setMaxInv(100);
        inhousePartRepository.save(ip1);

        InhousePart ip2 = new InhousePart();
        ip2.setId(905);
        ip2.setName("Laptop Battery");
        ip2.setPrice(3.00);
        ip2.setInv(20);
        ip2.setMinInv(1);
        ip2.setMaxInv(100);
        inhousePartRepository.save(ip2);

        InhousePart ip3 = new InhousePart();
        ip3.setId(903);
        ip3.setName("Tablet Camera");
        ip3.setPrice(49.99);
        ip3.setInv(40);
        ip3.setMinInv(1);
        ip3.setMaxInv(100);
        inhousePartRepository.save(ip3);

        InhousePart ip4 = new InhousePart();
        ip4.setId(904);
        ip4.setName("Smartwatch Strap");
        ip4.setPrice(19.99);
        ip4.setInv(100);
        ip4.setMinInv(1);
        ip4.setMaxInv(200);
        inhousePartRepository.save(ip4);

        InhousePart ip5 = new InhousePart();
        ip5.setId(905);
        ip5.setName("VR Headset Lens");
        ip5.setPrice(29.99);
        ip5.setInv(20);
        ip5.setMinInv(1);
        ip5.setMaxInv(50);
        inhousePartRepository.save(ip5);

        // Outsourced parts
        OutsourcedPart op1 = new OutsourcedPart();
        op1.setCompanyName("Tech Supplies Co.");
        op1.setName("Wireless Charger");
        op1.setInv(10);
        op1.setPrice(10.00);
        op1.setId(700);
        op1.setMinInv(1);
        op1.setMaxInv(100);
        outsourcedPartRepository.save(op1);

        OutsourcedPart op2 = new OutsourcedPart();
        op2.setCompanyName("Gadget Pros Inc.");
        op2.setName("Bluetooth Speaker");
        op2.setInv(50);
        op2.setPrice(4.00);
        op2.setId(705);
        op2.setMinInv(1);
        op2.setMaxInv(100);
        outsourcedPartRepository.save(op2);

        OutsourcedPart op5 = new OutsourcedPart();
        op5.setCompanyName("Wearable Tech");
        op5.setName("Fitness Tracker");
        op5.setInv(50);
        op5.setPrice(3.00);
        op5.setId(710);
        op5.setMinInv(1);
        op5.setMaxInv(100);
        outsourcedPartRepository.save(op5);

        // Products
        Product tech_bundle1 = new Product("Smartphone Bundle", 10.00, 5);
        Product tech_bundle2 = new Product("Laptop Essentials", 25.00, 8);
        Product tech_bundle3 = new Product("Tablet Package", 50.00, 6);
        Product tech_bundle4 = new Product("Smartwatch Set", 45.00, 4);
        Product tech_bundle5 = new Product("VR Experience", 50.00, 7);

        productRepository.save(tech_bundle1);
        productRepository.save(tech_bundle2);
        productRepository.save(tech_bundle3);
        productRepository.save(tech_bundle4);
        productRepository.save(tech_bundle5);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products: " + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts: " + partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
