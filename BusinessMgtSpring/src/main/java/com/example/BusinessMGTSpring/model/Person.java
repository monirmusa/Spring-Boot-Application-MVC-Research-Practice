package com.example.BusinessMGTSpring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    private int id;
    @Embedded
    private Name name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> phone;


    public Person() {
    }

    public Person(int id, Name name, List<Address> address, List<Phone> phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                ", phone=" + phone +
                '}';
    }
}
