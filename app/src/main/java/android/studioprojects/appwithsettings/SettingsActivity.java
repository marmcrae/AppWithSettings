package android.studioprojects.appwithsettings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

    public class SettingsActivity extends AppCompatActivity {
        public static final String
                KEY_PREF_EXAMPLE_SWITCH = "example_switch";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            switch (getSupportFragmentManager().beginTransaction()
                    .replace(android.R.id.content,
                            new SettingsFragment()).commit()) {
            }
        }
    }

