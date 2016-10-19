package app.test.ru.less4;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity
        implements  Fragment1.OnFragmentInteractionListener,
        Fragment2.MyActivitiIntf {

    Fragment1 f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        f1 = (Fragment1)fm.findFragmentById(R.id.fragment);

//        FrameLayout frame = (FrameLayout)findViewById(R.id.frame1);

        Fragment2 frgm2 = Fragment2.newInstance("", "");
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame1, frgm2);
        ft.commit();

    }

    @Override
    public void sendString(String string) {
        f1.setupString(string);
    }
}
