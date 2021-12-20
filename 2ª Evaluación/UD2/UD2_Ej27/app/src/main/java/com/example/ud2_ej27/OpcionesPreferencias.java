package com.example.ud2_ej27;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class OpcionesPreferencias extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}