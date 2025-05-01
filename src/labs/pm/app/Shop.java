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
        pm.printProductReport(p1);
        p1 = pm.reviewProduct(p1, FOUR_STAR, "Nice tea");
        p1 = pm.reviewProduct(p1, TWO_STAR, "Rather weak tea");
        p1 = pm.reviewProduct(p1, FOUR_STAR, "Fine tea");
        p1 = pm.reviewProduct(p1, FOUR_STAR, "Good tea");
        p1 = pm.reviewProduct(p1, FIVE_STAR, "Perfect tea");
        p1 = pm.reviewProduct(p1, THREE_STAR, "Just add some lemon");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), NOT_RATED);
        pm.printProductReport(p2);
        p2 = pm.reviewProduct(p2, FIVE_STAR, "Strong and bold");
        p2 = pm.reviewProduct(p2, FOUR_STAR, "Nice aroma");
        p2 = pm.reviewProduct(p2, THREE_STAR, "Too bitter for me");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Ice Cream", BigDecimal.valueOf(3.49), NOT_RATED, LocalDate.now().plusDays(5));
        pm.printProductReport(p3);
        p3 = pm.reviewProduct(p3, FOUR_STAR, "Sweet and creamy");
        p3 = pm.reviewProduct(p3, FIVE_STAR, "Perfect winter drink");
        p3 = pm.reviewProduct(p3, FOUR_STAR, "Kids love it");
        p3 = pm.reviewProduct(p3, FIVE_STAR, "Best hot chocolate ice cream I've had");
        pm.printProductReport(p3);

        Product p4 = pm.createProduct(104, "Green Tea", BigDecimal.valueOf(2.49), NOT_RATED);
        pm.printProductReport(p4);
        p4 = pm.reviewProduct(p4, THREE_STAR, "Decent");
        p4 = pm.reviewProduct(p4, TWO_STAR, "Too grassy");
        p4 = pm.reviewProduct(p4, THREE_STAR, "Ok with honey");
        pm.printProductReport(p4);

        Product p5 = pm.createProduct(105, "Herbal Infusion", BigDecimal.valueOf(2.79), NOT_RATED);
        pm.printProductReport(p5);
        p5 = pm.reviewProduct(p5, FIVE_STAR, "Very relaxing");
        p5 = pm.reviewProduct(p5, FOUR_STAR, "Great before bed");
        p5 = pm.reviewProduct(p5, FOUR_STAR, "Lovely smell");
        p5 = pm.reviewProduct(p5, FIVE_STAR, "Best herbal tea");
        p5 = pm.reviewProduct(p5, THREE_STAR, "Needs stronger flavor");
        pm.printProductReport(p5);
    }
}