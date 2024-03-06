package org.example;

import org.example.Entity.ProductFactory;
import org.example.Entity.User;
import org.example.Entity.UserFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ProductFactory pf = new ProductFactory();
        UserFactory uf = new UserFactory();

        Product meuProduto = new Product("Apple Watch", 2000, 5);
        Product meuProduto2 = new Product("Ipad", 3000, 5);
        pf.createProduct(meuProduto);
        pf.createProduct(meuProduto2);

        var result = pf.listAllProducts();
        result.forEach(e -> System.out.println(e.toString()));

        User user = new User("Arthur");
        uf.createUser(user);

        var users = uf.listAllUsers();
        users.forEach(u -> System.out.println(u.toString()));
    }
}