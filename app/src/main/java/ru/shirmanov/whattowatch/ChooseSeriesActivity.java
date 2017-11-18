package ru.shirmanov.whattowatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class ChooseSeriesActivity extends AppCompatActivity {
private SeriesList work = new SeriesList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_series);
    }

    public void onClickChooseSeries(View view) {
        TextView genre = (TextView)findViewById(R.id.genre);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        int seriesPlan = spinner.getSelectedItemPosition();
        StringBuilder sb = new StringBuilder();
        for(String s : work.getGenre(seriesPlan)){
            sb.append(s).append("\n");
        }
        genre.setText(sb.toString());
    }
}
