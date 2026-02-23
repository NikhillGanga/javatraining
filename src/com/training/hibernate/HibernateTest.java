package com.training.hibernate;

import java.time.Duration;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.hibernate.entity.Order;
import com.training.hibernate.entity.Product;
import com.training.hibernate.util.HibernateUtil;


public class HibernateTest {

	public static void main(String[] args) {
		
		//get the session
		Session session = HibernateUtil.getSessionFactory().openSession();
		//transaction
		Transaction transaction = session.beginTransaction();
		
			//weekend assignment task
		
		//Question-1:  Perform all crud operation Add, fetch, fetch by id and name, delete, update using hibernate.
				//inserting
//		Product product = new Product();
//		product.setProdName("Laptop");
//		product.setProdDesc("Gaming Laptop");
//		product.setPrice(50000);
//		product.setStock(10);
//		product.setCreatedAt(LocalDateTime.now());
//
//		session.save(product);
//
//		transaction.commit();
//		session.close();
//
//		System.out.println("Product inserted with ID: " + product.getProdId());
		
				//fetching all Products
//		List<Product> productList = session.createQuery("from Product", Product.class).list();
//		for (Product p : productList) {
//		    System.out.println(
//		        p.getProdId() + " | " +
//		        p.getProdName() + " | " +
//		        p.getPrice() + " | " +
//		        p.getStock()
//		    );
//		}
//		session.close();
		
				//fetching by ID
//		int prodId = 1;
//		Product product = session.get(Product.class, prodId);
//		if (product != null) {
//		    System.out.println("Product Found: " + product.getProdName());
//		} else {
//		    System.out.println("Product not found");
//		}
//
//		session.close();
		
				//fetching by name
		
//		String name = "Laptop";
//		Product product = session.createQuery(
//		        "from Product where prodName = :name", Product.class)
//		    .setParameter("name", name)
//		    .uniqueResult();
//
//		if (product != null) {
//		    System.out.println("Found product with stock: " + product.getStock());
//		} else {
//		    System.out.println("Product not found");
//		}
//
//		session.close();
		
		
				//update product
//		int prodId = 1;
//		Product product = session.get(Product.class, prodId);
//
//		if (product != null) {
//		    product.setPrice(52000);   // updated price
//		    product.setStock(15);      // updated stock
//
//		    session.update(product);
//		}
//
//		transaction.commit();
//		session.close();
//
//		System.out.println("Product updated successfully");
		
		
				//delete product
//		int prodId = 1;
//		Product product = session.get(Product.class, prodId);
//
//		if (product != null) {
//		    session.delete(product);
//		}
//
//		transaction.commit();
//		session.close();
//
//		System.out.println("Product deleted successfully");
		
		
		
		
		
		//Question-2

		
//		try {
//		    int prodId = 1;
//		    int quantity = 2000;
//
//		    Product product = session.get(Product.class, prodId);
//
//		    if (product == null) {
//		        throw new RuntimeException("Product not found");
//		    }
//
//		    if (product.getStock() < quantity) {
//		        throw new RuntimeException("Insufficient stock");
//		    }
//
//		    // Reduce stock
//		    product.setStock(product.getStock() - quantity);
//		    session.update(product);
//
//		    // Create order
//		    Order order = new Order();
//		    order.setProduct(product);
//		    order.setQuantity(quantity);
//		    order.setOrderType("ONLINE");
//		    order.setTotalAmount(quantity * product.getPrice());
//		    order.setOrderTime(LocalDateTime.now());
//
//		    session.save(order);
//
//		    transaction.commit();
//		    System.out.println("Order placed successfully");
//
//		} catch (Exception e) {
//		    transaction.rollback();
//		    System.out.println("Order failed: " + e.getMessage());
//		} finally {
//		    session.close();
//		}
		
		
		
		//Question-3:

		try {
		    long prodId = 1;
		    int quantity = 2;

		    // 1. Get product
		    Product product = session.get(Product.class, prodId);

		    if (product == null) {
		        throw new RuntimeException("Product not found");
		    }

		    // 2. Check stock
		    if (product.getStock() < quantity) {
		        throw new RuntimeException("Insufficient stock");
		    }

		    // 3. Check if any order exists in last 5 minutes
		    Long orderCount = session.createQuery(
		        "select count(o) from Order o " +
		        "where o.product.prodId = :pid " +
		        "and o.orderTime >= :timeLimit",
		        Long.class        // 👈 important part
		    )
		    .setParameter("pid", prodId)
		    .setParameter("timeLimit", LocalDateTime.now().minusMinutes(5))
		    .uniqueResult();

		    if (orderCount != null && orderCount > 0) {
		        throw new RuntimeException("Duplicate order within 5 minutes not allowed");
		    }

		    // 4. Reduce stock
		    product.setStock(product.getStock() - quantity);
		    session.update(product);

		    // 5. Create order
		    Order order = new Order();
		    order.setProduct(product);
		    order.setQuantity(quantity);
		    order.setOrderType("ONLINE");
		    order.setTotalAmount(quantity * product.getPrice());
		    order.setOrderTime(LocalDateTime.now());

		    session.save(order);

		    transaction.commit();
		    System.out.println("Order placed successfully");

		} catch (Exception e) {
		    transaction.rollback();
		    System.out.println("Order failed: " + e.getMessage());
		} finally {
		    session.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
