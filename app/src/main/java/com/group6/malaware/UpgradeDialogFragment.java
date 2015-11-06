package com.group6.malaware;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Cyril Mathew on 11/4/15.
 */
public class UpgradeDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getArguments().getString("Title"));
        builder.setMessage("Count of Upgrade: " + "\n")
                .setPositiveButton("x25", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.i("Info", "You clicked x25");
                    }
                })
                .setNegativeButton("x10", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        Log.i("Info", "You clicked x10");
                    }
                })
                .setNeutralButton("x1", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.i("Info", "You clicked x1");

                    }
                });
                    // Create the AlertDialog object and return it
        return builder.create();

    }
}
