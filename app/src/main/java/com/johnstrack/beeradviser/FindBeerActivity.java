package com.johnstrack.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // Called when the user clicks the button
    public void onClickFindBeer(View view) {
        // Get a reference to the TextView
        TextView brands = findViewById(R.id.brands);

        // Get a reference to the Spinner
        Spinner color = findViewById(R.id.color);

        // Get the selected item on the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

        //Display the selected item
        brands.setText(brandsFormatted);
    }
}