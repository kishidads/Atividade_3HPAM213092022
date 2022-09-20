package br.com.etecia.atividade_3hpam2_13092022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    JuiceFragment juiceFragment = new JuiceFragment();
    IceCreamFragment iceCreamFragment = new IceCreamFragment();
    CakeFragment cakeFragment = new CakeFragment();
    DonutFragment donutFragment = new DonutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.idFrameLayout, juiceFragment).
                commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mJuice:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idFrameLayout, juiceFragment).
                                commit();
                        return true;
                    case R.id.mIceCream:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idFrameLayout, iceCreamFragment).
                                commit();
                        return true;
                    case R.id.mCake:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idFrameLayout, cakeFragment).
                                commit();
                        return true;
                    case R.id.mDonut:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idFrameLayout, donutFragment).
                                commit();
                        return true;


                }

                return false;
            }
        });
    }
}