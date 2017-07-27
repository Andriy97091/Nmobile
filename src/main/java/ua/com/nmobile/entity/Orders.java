package ua.com.nmobile.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<User>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "orders")
    private List<Product> products = new ArrayList<Product>();

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Backet backet;

    private int allPrice;

    public Orders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Backet getBacket() {
        return backet;
    }

    public void setBacket(Backet backet) {
        this.backet = backet;
    }

    public double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(int allPrice) {
        this.allPrice = allPrice;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", allPrice=" + allPrice +
                '}';
    }
}
