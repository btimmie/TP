/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.cput.tp.Inheritance;

import com.branwyn.cput.tp.Encapsulation.Library;

/**
 *
 * @author Branwyn
 */
public class Academic extends Library{
    private String category,section,level;

    public Academic(String category, String section, String level) {
                
        this.category = category;
        this.section = section;
        this.level = level;
    }
    public Academic(String name, String address, int books) {
        super(name, address, books);
    }
    
    Academic()
    {
        super();
    }

    public String getCategory() {
        return category;
    }

    public String getSection() {
        return section;
    }

    public String getLevel() {
        return level;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    
    
}