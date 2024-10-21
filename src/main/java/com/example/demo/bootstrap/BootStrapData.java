package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;


    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository=inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();

        InhousePart ip1 = new InhousePart();
        ip1.setId(901);
        ip1.setName("1/2 x 520 STD NAT");
        ip1.setPrice(1.85);
        ip1.setInv(10000);
        ip1.setMinInv(1);
        ip1.setMaxInv(30000);
        inhousePartRepository.save(ip1);
        InhousePart thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("1/2 x 520 STD NAT"))thePart=part;
        }

        InhousePart ip2 = new InhousePart();
        ip2.setId(905);
        ip2.setName("1/2 x 260 STD NAT");
        ip2.setPrice(1.03);
        ip2.setInv(10000);
        ip2.setMinInv(1);
        ip2.setMaxInv(30000);
        inhousePartRepository.save(ip2);
        thePart=null;
        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            if(part.getName().equals("1/2 x 260 STD NAT"))thePart=part;
        }


        inhouseParts=(List<InhousePart>) inhousePartRepository.findAll();
        for(InhousePart part:inhouseParts){
            System.out.println(part.getName()+" "+part.getId());
        }


        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();

        OutsourcedPart op1= new OutsourcedPart();
        op1.setCompanyName("Great Plastics");
        op1.setName("1/2 x 5 Shell");
        op1.setInv(20000);
        op1.setPrice(0.12);
        op1.setId(700);
        op1.setMinInv(1);
        op1.setMaxInv(20000);
        outsourcedPartRepository.save(op1);
        OutsourcedPart theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("1/2 x 5 Shell"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op2= new OutsourcedPart();
        op2.setCompanyName("Indiana Plastics");
        op2.setName("1/2 x 5 Spool");
        op2.setInv(20000);
        op2.setPrice(0.20);
        op2.setId(705);
        op2.setMinInv(1);
        op2.setMaxInv(20000);
        outsourcedPartRepository.save(op2);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("1/2 x 5 Spool"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        OutsourcedPart op5= new OutsourcedPart();
        op5.setCompanyName("Tape God Manufacturing");
        op5.setName("NAT Thread seal");
        op5.setInv(300);
        op5.setPrice(50.00);
        op5.setId(710);
        op5.setMinInv(1);
        op5.setMaxInv(300);
        outsourcedPartRepository.save(op5);
        theOutPart=null;
        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("NAT Thread seal"))theOutPart=part;
        }

        System.out.println(theOutPart.getCompanyName());

        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        Product display_ct_case= new Product("12 Ct. Case",25.00,10);
        Product medium_display_ct_case= new Product("40 Ct. Case",40.00,10);
        Product standard_ct_case= new Product("144 Ct. Case",100.00,20);
        Product medium_ct_case= new Product("200 Ct. Case",130.00,15);
        Product large_ct_case= new Product("300 Ct. Case",160.00,10);

        productRepository.save(display_ct_case);
        productRepository.save(medium_display_ct_case);
        productRepository.save(standard_ct_case);
        productRepository.save(medium_ct_case);
        productRepository.save(large_ct_case);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
