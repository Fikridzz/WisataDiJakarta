package com.example.fikridzakwan.wisatadijakarta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Gereja extends AppCompatActivity {

    @BindView(R.id.btnExploreJakarta)
    Button btnExploreJakarta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gereja);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnExploreJakarta)
    public void onViewClicked() {
        Intent pindah = new Intent(this, Perpustakaan.class);
        startActivity(pindah);
    }
}
