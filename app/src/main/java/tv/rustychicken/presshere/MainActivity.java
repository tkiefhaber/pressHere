package tv.rustychicken.presshere;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends android.support.v7.app.AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PageOneFragment pageOne = new PageOneFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment, pageOne);
        transaction.addToBackStack(null);
        transaction.setTransition(R.anim.abc_slide_in_bottom);
        transaction.setTransitionStyle(R.anim.abc_slide_in_bottom);
        transaction.commit();

        getSupportActionBar().hide();
    }

}
