/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Prob9;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        EBook book = new EBook("book", 3);
        List<EBookCopy> bookCopies = book.getCopies();
        bookCopies.forEach(copy -> copy.changeAvailability());

        boolean isAvailable = bookCopies.stream().map(copy -> copy.isAvailable()).reduce(false, (x, y) -> (x || y));

        System.out.println("IsAvailable: " + isAvailable);
    }

}
