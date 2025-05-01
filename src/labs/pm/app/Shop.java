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
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager(Locale.US);

        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
        pm.printProductReport(101);
        pm.reviewProduct(101, FOUR_STAR, "Nice tea");
        pm.reviewProduct(101, TWO_STAR, "Rather weak tea");
        pm.reviewProduct(101, FOUR_STAR, "Fine tea");
        pm.reviewProduct(101, FOUR_STAR, "Good tea");
        pm.reviewProduct(101, FIVE_STAR, "Perfect tea");
        pm.reviewProduct(101, THREE_STAR, "Just add some lemon");
        pm.printProductReport(101);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), NOT_RATED);
        pm.printProductReport(102);
        pm.reviewProduct(102, FIVE_STAR, "Strong and bold");
        pm.reviewProduct(102, FOUR_STAR, "Nice aroma");
        pm.reviewProduct(102, THREE_STAR, "Too bitter for me");
        pm.printProductReport(102);

        Product p3 = pm.createProduct(103, "Ice Cream", BigDecimal.valueOf(3.49), NOT_RATED, LocalDate.now().plusDays(5));
        pm.printProductReport(103);
        pm.reviewProduct(103, FOUR_STAR, "Sweet and creamy");
        pm.reviewProduct(103, FIVE_STAR, "Perfect winter drink");
        pm.reviewProduct(103, FOUR_STAR, "Kids love it");
        pm.reviewProduct(103, FIVE_STAR, "Best hot chocolate ice cream I've had");
        pm.printProductReport(103);

        Product p4 = pm.createProduct(104, "Green Tea", BigDecimal.valueOf(2.49), NOT_RATED);
        pm.printProductReport(104);
        pm.reviewProduct(104, THREE_STAR, "Decent");
        pm.reviewProduct(104, TWO_STAR, "Too grassy");
        pm.reviewProduct(104, THREE_STAR, "Ok with honey");
        pm.printProductReport(104);

        Product p5 = pm.createProduct(105, "Herbal Infusion", BigDecimal.valueOf(2.79), NOT_RATED);
        pm.printProductReport(105);
        pm.reviewProduct(105, FIVE_STAR, "Very relaxing");
        pm.reviewProduct(105, FOUR_STAR, "Great before bed");
        pm.reviewProduct(105, FOUR_STAR, "Lovely smell");
        pm.reviewProduct(105, FIVE_STAR, "Best herbal tea");
        pm.reviewProduct(105, THREE_STAR, "Needs stronger flavor");
        pm.printProductReport(p5);
    }
}