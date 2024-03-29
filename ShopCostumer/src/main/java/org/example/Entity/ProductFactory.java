package org.example.Entity;

import org.example.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductFactory implements Factory{

    private final Product product = new Product();

    private final DB db = new DB();

    public ProductFactory() {
        super();
    }

    public void createProduct(Product product) {
        String stringQuery = String.format(
                "insert into product (name, price, amount)" +
                "values ('%s', %d, %d)", product.getName(), product.getValue(), product.getAmount());
//        DB.execute(stringQuery);
    }

//    public List<Product> listAllProducts() throws SQLException {
//        List<Product> p = new ArrayList<>();
//        String stringQuery = "SELECT * FROM Product";
//        var result = db.execute(stringQuery, ProductFactory.this);
//        result.get().get(0);
////        return result.get();
//    }

    public Product createDTO(ResultSet resultSet) throws SQLException {
        Product p = new Product(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("price"),
                resultSet.getInt("amount"));

        return p;
    }


    @Override
    public Class<? extends Entity> getClassEntity() {
        return Product.class;
    }
}
