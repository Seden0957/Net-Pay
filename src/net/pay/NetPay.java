/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pay;

/**
 *
 * @author seden0957
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double netPay,hours,wage,insurance,tax;
        hours = 40;
        wage = 5;
        insurance = 2;
        tax =.22;
        netPay = (hours*wage-insurance)-tax*(hours*wage-insurance);
        System.out.println(netPay);
    }
    
}
