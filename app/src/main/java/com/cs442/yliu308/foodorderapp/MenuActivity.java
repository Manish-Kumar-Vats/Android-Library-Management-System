package com.cs442.yliu308.foodorderapp;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import android.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class MenuActivity extends FragmentActivity {

    private static final int CONTENT_VIEW_ID = 10101010;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.id_fragment_list, new MenuListFragment());
        fragmentTransaction.commit();

        }
}
