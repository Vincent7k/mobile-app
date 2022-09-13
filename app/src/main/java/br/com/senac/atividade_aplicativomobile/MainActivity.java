package br.com.senac.atividade_aplicativomobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    CakeFragment cakeFragment = new CakeFragment();
    CoffeeFragment coffeeFragment = new CoffeeFragment();
    DonutFragment donutFragment = new DonutFragment();
    TeaFragment teaFragment = new TeaFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.idBottomNavVIew);

        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, cakeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.cake:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,cakeFragment).commit();
                        return true;

                    case R.id.coffee:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,coffeeFragment).commit();
                        return true;

                    case R.id.donut:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,donutFragment).commit();
                        return true;

                    case R.id.tea:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,teaFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }
}