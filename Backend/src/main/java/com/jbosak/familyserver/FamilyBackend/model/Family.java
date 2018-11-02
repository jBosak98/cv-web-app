package com.jbosak.familyserver.FamilyBackend.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class Family {

//    @Id
//    private Long id;


    private Father father;

    private Set<Child> children = new HashSet<>();

    public Family() {
    }


    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

}
