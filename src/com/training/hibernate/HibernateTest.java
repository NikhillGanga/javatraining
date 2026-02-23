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
//		Order Placement Logic
//		Write a Hibernate program to place an order.
//		Requirements:
//		Accept:
//		    prodId
//		    quantity
//		Validate:
//		    Product exists
//		    Stock is sufficient
//		Reduce stock
//		Insert order
//		Commit transaction
//		Constraints:
//		    Use transaction management.
//		    If stock is insufficient → rollback.
//		    Stock must never go negative.
		
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
//		Avoid Duplicate Order
//		Modify the above program so that:
//		If the same product is ordered twice within 5 minutes,
//		the second order should be rejected.
		
		try {
		    long prodId = 1;
		    int quantity = 2;

		    Product product = session.get(Product.class, prodId);

		    if (product == null) {
		        throw new RuntimeException("Product not found");
		    }

		    // 1. Fetch last order
		    Order lastOrder = session.createQuery(
		        "from Order o where o.product.prodId = :pid " +
		        "order by o.orderTime desc", Order.class)
		        .setParameter("pid", prodId)
		        .setMaxResults(1)
		        .uniqueResult();

		    // 2. Time comparison
		    if (lastOrder != null) {
		        long minutesDiff = Duration.between(
		                lastOrder.getOrderTime(),
		                LocalDateTime.now()).toMinutes();

		        if (minutesDiff < 5) {
		            throw new RuntimeException(
		                "Duplicate order within 5 minutes not allowed");
		        }
		    }

		    // 3. Stock check
		    if (product.getStock() < quantity) {
		        throw new RuntimeException("Insufficient stock");
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//creating the product and order and inserting it into database table directly
		
		//create a product object
//		Product product = new Product();
//		product.setProdName("laptop");
//		product.setProdDesc("Electronics");
//		product.setPrice(2000);
//		
//		//seving it to database
//		session.persist(product);
//		
//		//create a order object
//		Order order = new Order();
//		order.setOrderDate(LocalDate.now());
//		order.setOrderType("new");
//		order.setProduct(product);
//		
//		//saving it to database
//		session.persist(order);
//		
//		//commit transaction
//		transaction.commit();
//		
//		//close the session
//		session.close();
		

		
		
		
		
		//find the product
//		Product product = session.find(Product.class, 1);
//		System.out.println(product.getProdName());
//		
//		//closing the session
//		session.close();
		
		
		//fetch all the records from the product table
		
//		 SelectionQuery<Product> selectionQuery = (SelectionQuery<Product>) session.createSelectionQuery("from Product", Product.class);
//		 List<Product> resultList = selectionQuery.getResultList();
//		 resultList.forEach((p)-> System.out.println(p.getProdName()+p.getPrice()));
		 
		// session.close();
		
		
	}

}
