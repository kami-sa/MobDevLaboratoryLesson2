package ru.mirea.saidova.dialogapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog (@Nullable Bundle savedInstanceState)
    {
        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setTitle("Title");
        pd.setMessage("Message");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setIndeterminate(true);
//если закомментировать все set методы, то прогресс диалог примет вид бегающего круга
        return pd;
    }
}
