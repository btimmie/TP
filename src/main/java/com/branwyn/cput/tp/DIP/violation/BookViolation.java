/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.cput.tp.DIP.violation;

/**
 *
 * @author Branwyn
 */
public class BookViolation {
    private int numOfBooks;
    private ErrorMessage errMsg;
    
    
    public int validateInteger(String strBooks)
    {
        try
        {
            numOfBooks = Integer.parseInt(strBooks);
        }
        catch(Exception ex)
        {
            errMsg.intErrorMessage();
            return 0;
        }
        return numOfBooks;
    }
}
