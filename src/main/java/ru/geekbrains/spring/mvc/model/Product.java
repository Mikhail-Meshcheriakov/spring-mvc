package ru.geekbrains.spring.mvc.model;

public class Product {
    private Long id;
    private String title;
    private Integer coast;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer coast) {
        this.coast = coast;
    }

    public Product(Long id, String title, Integer coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public Product() {

    }
}
