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
import java.util.Comparator;
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");

//        pm.parseReview("101,2,Rather weak tea");
//        pm.parseReview("101,3,Fine tea");
//        pm.parseReview("101,4,Good tea");
//        pm.parseReview("101,5,Perfect tea");
//        pm.parseReview("101,3,Just add some lemon");
        pm.printProductReport(101);

//        pm.parseProduct("F,103,Cake,3.99,0,2025-04-21");
        pm.printProductReport(103);
//        pm.dumpData();
//        pm.restoreData();


        pm.printProductReport(103);


//        pm.printProducts((p1, p2) ->
//                p2.getRating().ordinal() - p1.getRating().ordinal());
//        pm.printProducts((p1, p2) ->
//                p2.getPrice().compareTo(p1.getPrice()));
//
//        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
//        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());
//
//        pm.printProducts(p -> p.getPrice().floatValue() < 2, priceSorter);
//        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + "\t" + discount));
//

    }
}