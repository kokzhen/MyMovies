package sg.edu.rp.c346.id22014093.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Movie> MovieList;

    public CustomAdapter(Context context,int resource, ArrayList<Movie>object) {
        super(context, resource, object);
        parent_context = context;
        layout_id = resource;
        MovieList = object;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvYear = rowView.findViewById(R.id.tvYear);
        TextView tvGenre = rowView.findViewById(R.id.tvGenre);
        ImageView ivRated = rowView.findViewById(R.id.imageView);

        Movie currentMovie = MovieList.get(position);

        tvTitle.setText(currentMovie.getTitle());
        tvYear.setText(String.valueOf(currentMovie.getYear()));
        tvGenre.setText(currentMovie.getGenre());

        if (currentMovie.getRated().equalsIgnoreCase("g")) {
            ivRated.setImageResource(R.drawable.rating_g);
        } else if (currentMovie.getRated().equalsIgnoreCase("pg")) {
            ivRated.setImageResource(R.drawable.rating_pg);
        } else if (currentMovie.getRated().equalsIgnoreCase("pg13")) {
            ivRated.setImageResource(R.drawable.rating_pg13);
        } else if (currentMovie.getRated().equalsIgnoreCase("nc16")) {
            ivRated.setImageResource(R.drawable.rating_nc16);
        } else if (currentMovie.getRated().equalsIgnoreCase("m18")) {
            ivRated.setImageResource(R.drawable.rating_m18);
        } else if (currentMovie.getRated().equalsIgnoreCase("r21")) {
            ivRated.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
