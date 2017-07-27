package ua.com.nmobile.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Backet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "backet")
    private List<Product> products=new ArrayList<Product>();
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;

    public Backet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                '}';
    }
}
