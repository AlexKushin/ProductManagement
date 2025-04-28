/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public Licence as
 * published by the Free Software Foundation , either version 3 of
 * the Licence , or (at your opinion) ant later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY  or FITNESS FOR PRACTICAL PURPOSE. See the
 * GNU General Public Licence for more details.
 *
 * You should have received a copy of the GNU General Public
 * Licence along with this program. If not, see
 * <http://www.gnu.org/licences/>.
 */
package labs.pm.app;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author kyshi
 **/

import labs.pm.data.*;

import static labs.pm.data.Rating.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(101, "Cookie", BigDecimal.valueOf(3.99), TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(FIVE_STAR);
//        Product p9 = p1.applyRating(TWO_STAR);

        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p6.equals(p7));
//        System.out.println(p8);
//        System.out.println(p9);
//        /*if(p3 instanceof Food f){
//            System.out.println(f.getBestBefore());
//        }*/
//        System.out.println(p3.getBestBefore());
//        System.out.println(p1.getBestBefore());
        pm.printProductReport();
        p1 = pm.reviewProduct(p1, FOUR_STAR, "Nice tea");
        pm.printProductReport();

    }
}