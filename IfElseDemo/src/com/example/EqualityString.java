/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class EqualityString {

    public static void main(String args[]) {
        String name1 = "Fred Smith";
        String name2 = "Sam Smith";
        if (name1.equals(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }
}
