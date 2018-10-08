package com.jbosak.familyserver.FamilyBackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Child {

    public static final int MALE = 1;
    public static final int FEMALE = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    @ManyToOne
    @JsonIgnoreProperties("children")
    private Father father;

    private String firstName;
    private String lastName;
    private int pesel;
    private Date dateOfBirth;
    private int gender;

    public Child(Father father, String firstName, String lastName, int pesel, Date dateOfBirth, int gender) {
        this.father = father;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Child() {
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", father=" + father +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return pesel == child.pesel &&
                gender == child.gender &&
                Objects.equals(id, child.id) &&
                Objects.equals(father, child.father) &&
                Objects.equals(firstName, child.firstName) &&
                Objects.equals(lastName, child.lastName) &&
                Objects.equals(dateOfBirth, child.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;

    }
}
