package be.gonybeckers.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import be.gonybeckers.pizza.pizzeria.Pizzeria;

public class MainActivity extends AppCompatActivity {
    String FILENAME = "pizzerias.json";
    ArrayList<Pizzeria> pizzerias = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(my_toolbar);
        my_toolbar.setTitle("Compose your Pizza");

        Button establishment = findViewById(R.id.establishment_found);
        Button pizza = findViewById(R.id.pizzas_found);

        pizzerias = getPizzerias(FILENAME);
        establishment.setText(getString(R.string.nbr_establishment_found, pizzerias.size()));
        // Implementation of a counter for pizzas (from all pizzerias)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        return true;
    }

    private String readDataFile(String filename){
        String string = null;
        try {
            InputStream inputStream = getAssets().open(filename);
            int size = inputStream.available(); // Get max bytes to read
            byte[] buffer = new byte[size]; // Allocate buffer to read data
            inputStream.read(buffer); // Read data into buffer
            inputStream.close();
            string = new String(buffer, StandardCharsets.UTF_8); // Convert (Byte) buffer into string
        } catch (IOException e){ // ----- ADD FILE NOT FOUND EXCEPTION -----
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Unable to read file.", Toast.LENGTH_SHORT).show();
        }
        return string;
    }

    private List<JSONObject> getJSONObjects(String data) {
        ArrayList<JSONObject> jsonObjectsList = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(data);
            for(int i = 0; i < 2; i++) {
                jsonObjectsList.add(jsonArray.getJSONObject(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Unable to fetch data.", Toast.LENGTH_SHORT).show();
        }
        return jsonObjectsList;
    }

    private Pizzeria JSONObjectParser(JSONObject json) {
        Pizzeria pizzeria = null;
        try {
            pizzeria = new ObjectMapper().readerFor(Pizzeria.class).readValue(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pizzeria;
    }

    private ArrayList<Pizzeria> getPizzerias(String filename) {
        String data = readDataFile(filename);
        ArrayList<Pizzeria> pizzerias = new ArrayList<>();
        if(data != null) {
            ArrayList<JSONObject> jsonObjectsList = new ArrayList<>(getJSONObjects(data));
            for(int i = 0; i < jsonObjectsList.size(); i++) {
                pizzerias.add(JSONObjectParser(jsonObjectsList.get(i)));
            }
        }
        return pizzerias;
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
