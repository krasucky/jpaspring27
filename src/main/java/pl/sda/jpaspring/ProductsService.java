package pl.sda.jpaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public void addProduct(String productNameInput, String isbnInput, String productTypeInput) {
        ProductType productType = ProductType.valueOf(productTypeInput.toUpperCase());
        Product product = new Product(isbnInput, productNameInput, productType);
        productsRepository.save(product);
    }
}
