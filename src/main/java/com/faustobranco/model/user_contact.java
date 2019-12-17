package com.faustobranco.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class user_contact {
    private Integer id;
    private contact_Name name;
    private List<contact_Phone> contact;

    @JsonCreator
    public user_contact(@JsonProperty("id") Integer id, @JsonProperty("name") contact_Name name, @JsonProperty("contact") List<contact_Phone> contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public contact_Name getName() {
        return name;
    }

    public List<contact_Phone> getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "com.faustobranco.model.user_contact{" +
                "id=" + id +
                ", name=" + name +
                ", contact=" + contact +
                '}';
    }
}

class contact_Name {
    private String first;
    private String last;

    @JsonCreator
    public contact_Name(@JsonProperty("first") String first, @JsonProperty("last") String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return "com.faustobranco.model.contact_Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}

class contact_Phone {
    private String type;
    private String ref;

    @JsonCreator
    public contact_Phone(@JsonProperty("type") String type, @JsonProperty("ref") String ref) {
        this.type = type;
        this.ref = ref;
    }

    public String getType() {
        return type;
    }

    public String getRef() {
        return ref;
    }

    @Override
    public String toString() {
        return "com.faustobranco.model.contact_Phone{" +
                "type='" + type + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}