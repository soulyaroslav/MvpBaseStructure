package com.soulyaroslav.mvpbasestructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.soulyaroslav.mvpbasestructure.manager.preference.PreferenceManager;

import rx.functions.Action1;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final PreferenceManager manager = new PreferenceManager(this, "test");

        manager.putString("key", "Hi, Man");

        manager.getString("key", "")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + " - already mapped";
                    }
                })
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
