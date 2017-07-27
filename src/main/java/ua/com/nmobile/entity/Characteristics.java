package ua.com.nmobile.entity;


import javax.persistence.*;

@Entity
public class Characteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Product product;

    private String producer;// виробник
    private String bodyType; //тип корпусу
    private String displayType; //тип дисплею
    private int memory; //память
    private int cell;//камера
    private String color;//колір
    private String processor; // процесор


    public Characteristics() {
    }

    public Characteristics(Product product, String producer, String bodyType, String displayType, int memory, int cell, String color, String processor) {
        this.product = product;
        this.producer = producer;
        this.bodyType = bodyType;
        this.displayType = displayType;
        this.memory = memory;
        this.cell = cell;
        this.color = color;
        this.processor = processor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Characteristics{" +
                "id=" + id +
                ", product=" + product +
                ", producer='" + producer + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", displayType='" + displayType + '\'' +
                ", memory=" + memory +
                ", cell=" + cell +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
