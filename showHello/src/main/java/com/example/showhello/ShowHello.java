package com.example.showhello;

import android.content.Context;
import android.widget.Toast;

public class ShowHello {
    public static void showHelle(Context context, String string) {
        Toast.makeText(context, string, Toast.LENGTH_LONG).show();
    }
}
