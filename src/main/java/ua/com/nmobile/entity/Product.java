package ua.com.nmobile.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String productName;
    private String shortDescription;
    private String description;
    private int price;
    private boolean itsSale;
    private boolean addToOrder;


    @ElementCollection
    private List<String> images = new ArrayList<String>();
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private SubCategory subCategory;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Backet backet;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Orders orders;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    List<Characteristics> characteristics = new ArrayList<Characteristics>();

    public Product() {
    }


    public Product(String productName) {
        this.productName = productName;
    }

    public Product(String title, String productName, String shortDescription,
                   String description, int price, List<String> images) {
        this.title = title;
        this.productName = productName;
        this.shortDescription = shortDescription;
        this.description = description;
        this.price = price;
        this.images = images;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //
    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }


    public void setCharacteristics(List<Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Backet getBacket() {
        return backet;
    }

    public void setBacket(Backet backet) {
        this.backet = backet;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public List<Characteristics> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristicss(List<Characteristics> characteristicss) {
        this.characteristics = characteristics;
    }

    public boolean isItsSale() {
        return itsSale;
    }

    public void setItsSale(boolean itsSale) {
        this.itsSale = itsSale;
    }

    public boolean isAddToOrder() {
        return addToOrder;
    }

    public void setAddToOrder(boolean addToOrder) {
        this.addToOrder = addToOrder;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", productName='" + productName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", images=" + images +
                '}';
    }
}
