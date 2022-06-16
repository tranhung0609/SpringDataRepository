package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dercription;

    public Province() {
    }

    public Province(Long id, String name, String dercription) {
        this.id = id;
        this.name = name;
        this.dercription = dercription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDercription() {
        return dercription;
    }

    public void setDercription(String dercription) {
        this.dercription = dercription;
    }
}
