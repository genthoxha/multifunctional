package com.java2.products.entities;/*
    This is the model class and contains all attributes that Products have.
    Also in this class are added some annotations from Spring and Hibernate Freamwork.
 */




import org.springframework.stereotype.Service;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Service
@Entity
public class Products {
    @Id
    @GeneratedValue
    public Long id;
    public String productName;
    public String producer;
    public String category;
    public double price;

    /*Default constructor */
    public Products() {
        super();
    }

    /*Main constructor used to create some products manually in main function*/
    public Products(String productName, String producer, String category, double price) {
        super();
        this.productName = productName;
        this.producer = producer;
        this.category = category;
        this.price = price;
    }

    /*Getters and setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /*Used to show objects in type of string */
    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
    /* Used to compare two Products by Id */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Products) {
            Products p = (Products) obj;
            return p.getId().equals(((Products) obj).getId());
        }
        return false;
    }
}
