package com.example.projecttoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redClicked(View view)
    {
//        Toast.makeText(this,"Hello", Toast.LENGTH_SHORT).show();
        showCustomToast("Yo");
    }

    public void showCustomToast(String string)
    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup)findViewById(R.id.toast_root));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText(string);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(layout);
        toast.show();
    }

    public void androidPressed(){
        showCustomToastAndroid("Hello Android");
    }


    public void showCustomToastAndroid(String string)
    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_android,(ViewGroup)findViewById(R.id.toast_android_root));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText(string);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(layout);
        toast.show();

    }
}
