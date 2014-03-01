/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.cput.tp.Encapsulation;

import java.io.Serializable;

/**
 *
 * @author Branwyn
 */
public class Library implements Serializable{
    public String name,address;
    public int books;

    //default constructor
    public Library(){
        name = "";
        address ="";
        books =0;        
    }

    public Library(String name, String address, int books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBooks(int books) {
        this.books = books;
    }

   
}
