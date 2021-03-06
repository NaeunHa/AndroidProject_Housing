package com.project.housing.models.response;

import com.tickaroo.tikxml.annotation.Element;
import com.tickaroo.tikxml.annotation.Xml;

import java.io.Serializable;
import java.util.List;

@Xml(name = "items")
public class Items implements Serializable {
    @Element(name = "item")
    private List<Item> item;

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}

