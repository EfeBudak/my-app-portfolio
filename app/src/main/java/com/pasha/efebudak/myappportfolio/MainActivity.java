package com.pasha.efebudak.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.main_button_popular_movies_first_part)
    Button buttonPopularMoviesFirstPart;
    @Bind(R.id.main_button_popular_movies_second_part)
    Button buttonPopularMoviesSecondPart;
    @Bind(R.id.main_button_super_duo)
    Button buttonSuperDuo;
    @Bind(R.id.main_button_build_it_bigger)
    Button buttonBuildItBigger;
    @Bind(R.id.main_button_make_your_app_material)
    Button buttonMakeYourAppMaterial;
    @Bind(R.id.main_button_go_ubiquitous)
    Button buttonGoUbiquitous;
    @Bind(R.id.main_button_capstone_design)
    Button buttonCapstoneDesign;
    @Bind(R.id.main_button_capstone_build)
    Button buttonCapstoneBuild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setListenerToButtons();

    }

    private void setListenerToButtons() {

        buttonPopularMoviesFirstPart.setOnClickListener(this);
        buttonPopularMoviesSecondPart.setOnClickListener(this);
        buttonSuperDuo.setOnClickListener(this);
        buttonBuildItBigger.setOnClickListener(this);
        buttonMakeYourAppMaterial.setOnClickListener(this);
        buttonGoUbiquitous.setOnClickListener(this);
        buttonCapstoneDesign.setOnClickListener(this);
        buttonCapstoneBuild.setOnClickListener(this);

    }

    private void showToastMessage(String pressedButtonMessage) {

        Toast.makeText(
                this, pressedButtonMessage, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.main_button_popular_movies_first_part:

                showToastMessage(buttonPopularMoviesFirstPart.getText().toString());
                break;

            case R.id.main_button_popular_movies_second_part:

                showToastMessage(buttonPopularMoviesSecondPart.getText().toString());
                break;

            case R.id.main_button_super_duo:

                showToastMessage(buttonSuperDuo.getText().toString());
                break;

            case R.id.main_button_build_it_bigger:

                showToastMessage(buttonBuildItBigger.getText().toString());
                break;

            case R.id.main_button_make_your_app_material:

                showToastMessage(buttonMakeYourAppMaterial.getText().toString());
                break;

            case R.id.main_button_go_ubiquitous:

                showToastMessage(buttonGoUbiquitous.getText().toString());
                break;

            case R.id.main_button_capstone_design:

                showToastMessage(buttonCapstoneDesign.getText().toString());
                break;

            case R.id.main_button_capstone_build:

                showToastMessage(buttonCapstoneBuild.getText().toString());
                break;

            default:
                break;


        }

    }
}
