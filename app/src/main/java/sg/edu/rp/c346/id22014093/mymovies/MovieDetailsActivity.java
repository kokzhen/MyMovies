package sg.edu.rp.c346.id22014093.mymovies;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieDetailsActivity extends MainActivity{

    RatingBar ratingBar;
    TextView tvTitle, tvDesc, tvWatch, tvShowing, tvGenre;
    ImageView ivRated;

    public void onCreate(Bundle savedInstance){
        ratingBar = findViewById(R.id.ratingBar);
        tvTitle = findViewById(R.id.textViewTitle);
        tvDesc = findViewById(R.id.tvDesc);
        tvWatch = findViewById(R.id.tvWatch);
        tvShowing = findViewById(R.id.tvShowing);
        tvGenre = findViewById(R.id.textViewYearGenre);
        ivRated = findViewById(R.id.imageViewRated);

        ivRated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTitle.setText("");
                tvGenre.setText("");
                tvDesc.setText("");
                tvWatch.setText("");
                tvShowing.setText("");
            }
        });
    }

}
