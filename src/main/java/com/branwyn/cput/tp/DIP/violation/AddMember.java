/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.cput.tp.DIP.violation;

import com.branwyn.cput.tp.Encapsulation.Library;
import com.branwyn.cput.tp.Inheritance.Academic;

/**
 *
 * @author Branwyn
 */
public class AddMember {
    private Member member;

    /**
     *
     * @param name
     * @param address
     * @param books
     */
    public void AddingMember(String name, String address, int books)
    {
        member = new Member(name, address, books);
    }

    private static class Member {

        public Member() {
        }

        private Member(String name, String address, int books) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
