package com.gitrepo.ui.activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.gitrepo.R;
import com.gitrepo.api.HttpClient;
import com.gitrepo.model.Application;
import com.gitrepo.ui.adapter.RepoAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);

        recyclerView = findViewById(R.id.rv_repo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        HttpClient httpClient =  new HttpClient();
        httpClient.getRepo(new Callback<Application>() {

            public void onResponse(Call<Application> call, Response<Application> response) {

                recyclerView.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);

                if(response.isSuccessful());
                recyclerView.setAdapter(new RepoAdapter(response.body(), MainActivity.this));

            }

            public void onFailure(Call<Application> call, Throwable t) {

                progressBar.setVisibility(View.GONE);
                new AlertDialog.Builder(MainActivity.this).setMessage("Servidor indisponível no momento, por favor tente mais tarde").setPositiveButton("Tentar Novamente", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        progressBar.setVisibility(View.VISIBLE);
                    }
                }).show();
            }
        });
    }

    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }
}

