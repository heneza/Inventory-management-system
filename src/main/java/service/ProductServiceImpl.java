package service;

import config.HibernateConfig;
import converter.ProductConverter;
import dao.ProductDao;
import dao.ProductDaoImpl;
import dto.ProductRequest;
import entity.Product;
import org.hibernate.SessionFactory;
import validator.ProductValidator;

import java.util.List;


public class ProductServiceImpl implements ProductService {

    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
    ProductDao productDao = new ProductDaoImpl(sessionFactory);

    @Override
    public void create(ProductRequest request) {
        ProductValidator
                .validateProduct(request);
        Product product = ProductConverter.convertToEntity(request);
        productDao.save(product);

    }

    @Override
    public List<Product> displayAllProduct() {
        return productDao.findAll();
    }


}
