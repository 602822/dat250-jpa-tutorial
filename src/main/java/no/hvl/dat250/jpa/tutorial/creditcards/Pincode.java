package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    private String code;

    private Integer count;

    public String getCode() {
        return code;
    }

    public Integer getCount() {
        return count;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setCount(Integer count) {
        this.count = count;
    }



}
