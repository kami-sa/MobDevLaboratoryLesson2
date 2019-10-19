package ru.mirea.saidova.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        //Intent intent = new Intent(this, Main2Activity.class);
        //this.startActivity(intent);
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        intent.putExtra("key", textView1.getText());
        startActivity(intent);
    }
}
