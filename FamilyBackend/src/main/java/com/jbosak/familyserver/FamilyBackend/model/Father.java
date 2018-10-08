package com.jbosak.familyserver.FamilyBackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Father {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private int pesel;
    private Date dateOfBirth;

    public Father(String firstName, String lastName, int pesel, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
    }

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    public Father(String firstName, String lastName, int pesel, Date dateOfBirth, Set<Child> children) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
        this.children = children;
    }

    @OneToMany(mappedBy = "father")
    @JsonIgnoreProperties("father")
    private Set<Child> children = new HashSet<>();


    public Father() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Father{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", dateOfBirth=" + dateOfBirth +
                ", children=" + children +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return pesel == father.pesel &&
                Objects.equals(id, father.id) &&
                Objects.equals(firstName, father.firstName) &&
                Objects.equals(lastName, father.lastName) &&
                Objects.equals(dateOfBirth, father.dateOfBirth) &&
                Objects.equals(children, father.children);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
