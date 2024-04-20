package dao;

import entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private final SessionFactory sessionFactory;

    public ProductDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Product product) {
        try{
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }

    @Override
    public Product findById(Long id) {
        return null;
    }


    @Override
    public List<Product> findAll() {
        return null;
    }
}
