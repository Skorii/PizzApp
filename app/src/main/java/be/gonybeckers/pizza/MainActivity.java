package be.gonybeckers.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import be.gonybeckers.pizza.Pizza;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Pizza[] shopping_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(my_toolbar);
        my_toolbar.setTitle("Compose your Pizza");

        Button establishment = findViewById(R.id.establishment_found);
        Button pizza = findViewById(R.id.pizzas_found);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        return true;
    }

    public void onEstablishmentFoundClick(View view) {
        // Display a "listView" with establishment found in the area.
    }

    public void onPizzaFoundClick(View view) {
        // Display a "listView" with all pizzas (name, compos and price) that meet the criteria
            // If one is selected, restrict choices of ingredients to the selected pizzeria.
            // Allow to add to the shopping list (Pizza Object list)
    }

    public void onAddPizzaClick(View view) {
        // Create Pizza Object and add it to shopping_list(Pizza Object list).
    }

    public void onNextStepSupplementClick(View view) {
        // Create new intent to choose supplements.
    }

    public void onShoppingCartClick(MenuItem menuItem) {
        // Display a "listView" of shopping_list (Pizza Object list). Allow to remove with confirmation
    }

    public void onSettingsClick(MenuItem menuItem) {
        // Start Settings Intent
    }

    public void onHelpFeedbackClick(MenuItem menuItem) {
        // Start Help & Feedback Intent
    }
}
