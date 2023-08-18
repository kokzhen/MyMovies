package sg.edu.rp.c346.id22014093.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Movie> alMovies;
    CustomAdapter caMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        alMovies = new ArrayList<>();

        // Initialize the CustomAdapter with your movie data
        caMovies = new CustomAdapter(this, R.layout.movie_details, alMovies);
        lv.setAdapter(caMovies);

        // Set item click listener for the ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Prepare the intent
                Intent intentDetail = new Intent(MainActivity.this, MovieDetailsActivity.class);

                // Insert data into the intent
                Movie currentMovie = alMovies.get(position);
                intentDetail.putExtra("title", currentMovie.getTitle());
                intentDetail.putExtra("year", currentMovie.getYear());
                intentDetail.putExtra("rated", currentMovie.getRated());
                intentDetail.putExtra("genre", currentMovie.getGenre());
                intentDetail.putExtra("watchDate", currentMovie.getWatchedOn());
                intentDetail.putExtra("theatre", currentMovie.getShowing());
                intentDetail.putExtra("desc", currentMovie.getDescription());

                // Start the new Activity
                startActivity(intentDetail);
            }
        });
    }
}