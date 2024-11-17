package com.taxiservice.admin.catalogo.infrastructure;

import com.taxiservice.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(new UseCase().execute("1", "Category 1"));
    }
}