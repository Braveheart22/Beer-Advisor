package com.johnstrack.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 2/21/2018 at 11:52 AM.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
