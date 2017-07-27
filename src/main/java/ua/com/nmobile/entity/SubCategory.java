package ua.com.nmobile.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameSubCategory;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Category category;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "subCategory")
    private List<Product> products=new ArrayList<Product>();

    public SubCategory() {
    }



    public SubCategory(String nameSubCategory) {
        this.nameSubCategory = nameSubCategory;
    }

    public SubCategory(String nameSubCategory, Category category) {
        this.nameSubCategory = nameSubCategory;
        this.category = category;
    }

    public SubCategory(String nameSubCategory, Category category, List<Product> products) {
        this.nameSubCategory = nameSubCategory;
        this.category = category;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSubCategory() {
        return nameSubCategory;
    }

    public void setNameSubCategory(String nameSubCategory) {
        this.nameSubCategory = nameSubCategory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "id=" + id +
                ", nameSubCategory='" + nameSubCategory + '\'' +
                ", category=" + category +
                '}';
    }
}
