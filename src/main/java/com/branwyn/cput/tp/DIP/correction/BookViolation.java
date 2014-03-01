/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.cput.tp.DIP.correction;

/**
 *
 * @author Branwyn
 */
public class BookViolation implements ErrorMessageInterface{

    private int numOfBooks;
       
    
    public int validateInteger(String strBooks) {
         try
        {
            numOfBooks = Integer.parseInt(strBooks);
        }
        catch(Exception ex)
        {
            intErrorMessage();
            return 0;
        }
        return numOfBooks;
    }

    public String intErrorMessage() {
        return "Invalid number entered.";
    }

  
    
}
