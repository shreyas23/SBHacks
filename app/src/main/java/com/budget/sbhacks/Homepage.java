package com.budget.sbhacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Shreyas Niradi on 1/20/2017.
 * hoh
 */

public class Homepage extends AppCompatActivity implements AuthenticationListener {

    AuthenticationDialog dialog;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Nithin: creating a dialogue for instagram authentication
        dialog = new AuthenticationDialog(Homepage.this, this);
        dialog.show();
    }

    @Override
    public void onCodeReceived(String code) {
        if (code != null) {
            dialog.dismiss();
        }
    }
}
