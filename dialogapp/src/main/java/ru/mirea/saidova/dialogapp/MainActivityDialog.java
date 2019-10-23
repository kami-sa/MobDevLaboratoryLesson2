package ru.mirea.saidova.dialogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityDialog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dialog);
    }
    public void onClickShowTimeDialog(View view) {
       // MyAlertDialogFragment dialogFragment = new MyAlertDialogFragment ();
       // dialogFragment.show(getSupportFragmentManager(), "dialog");
        MyTimeDialogFragment timeDialog = new MyTimeDialogFragment();
        timeDialog.show(getSupportFragmentManager(), "dialog");
        /*TextView tvTime = (TextView) findViewById(R.id.tvTime);
        if timeDialog.
        tvTime.setText(timeDialog.getTime());*/
        //Toast.makeText(getApplicationContext(), timeDialog.getTime(), Toast.LENGTH_LONG).show();

    }
    public void onClickShowDateDialog(View view) {
        MyDateDialogFragment dateDialog = new MyDateDialogFragment();
        dateDialog.show(getSupportFragmentManager(), "dialog");
    }

    public void onClickPD1 (View view)
    {
        MyProgressDialog prDialog = new MyProgressDialog();
        prDialog.show(getSupportFragmentManager(), "dialog");
    }

    public void onOkClicked() {
    Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                   Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
}
