package com.faustobranco.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class user_missing {
    private Integer id;
    private contact_missing_Name name;
    private List<contact_missing_Phone> contact;

    @JsonCreator
    public user_missing(@JsonProperty("id") Integer id, @JsonProperty("name") contact_missing_Name name, @JsonProperty("contact") List<contact_missing_Phone> contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public contact_missing_Name getName() {
        return name;
    }

    public List<contact_missing_Phone> getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "user_missing{" +
                "id=" + id +
                ", name=" + name +
                ", contact=" + contact +
                '}';
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class contact_missing_Name {
    private String first;
    private String last;

    @JsonCreator
    public contact_missing_Name(@JsonProperty("first") String first, @JsonProperty("last") String last) {
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
        return "contact_missing_Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class contact_missing_Phone {
    private String type;
    private String ref;

    @JsonCreator
    public contact_missing_Phone(@JsonProperty("type") String type, @JsonProperty("ref") String ref) {
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
        return "contact_missing_Phone{" +
                "type='" + type + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}