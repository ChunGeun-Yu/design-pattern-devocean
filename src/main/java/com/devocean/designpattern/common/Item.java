package com.devocean.designpattern.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {
    private String id;
    private String name;
    private int price;
}
