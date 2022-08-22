package com.example.x_cite;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.jar.Attributes;

public class PHonAdabter extends ArrayAdapter {
    List<Phons> B;

    public PHonAdabter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        B = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);

        Phons currentPhone = B.get(position);

        TextView PhoneName = view.findViewById(R.id.Titel);
        TextView PhonePrnd = view.findViewById(R.id.Apple);
        ImageView PhoneImgee = view.findViewById(R.id.imageView);


        PhoneName.setText(currentPhone.getPhonName());
        PhonePrnd.setText(currentPhone.getPhoneBrand());
        PhoneImgee.setImageResource(currentPhone.getPhoneIMge());

        ImageView dleteButtoun = view.findViewById(R.id.dlete);
        dleteButtoun.setOnClickListener(new View.OnClickListener() {

            Phons removedPhone  = B.get(position);
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are You Sure Man Manegaaa").setTitle("تنبيه هااام").setPositiveButton("DElET", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        B.remove(removedPhone);
                        notifyDataSetChanged();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }

                });
                builder.show();

            }
        });

        return view;

    }
}