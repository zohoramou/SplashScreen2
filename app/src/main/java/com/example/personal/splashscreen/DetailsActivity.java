package com.example.personal.splashscreen;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgDoctor;
    TextView txtName, txtDesc;

    String mobileNumber[] = {"01757291594", "012733644", "0137637454", "0136734675"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgDoctor = findViewById(R.id.imageView);
        txtName = findViewById(R.id.textName);
        txtDesc = findViewById(R.id.txt_desc);

        //Recieved Data
        String getName = getIntent().getExtras().getString("dr_name");

        if (getName.equals("one")) {
            imgDoctor.setImageResource(R.drawable.dr_shefa);
            txtName.setText("Dr.Shefatuz Zahan");
            txtDesc.setText("Medicine Specialist\nTime:8pm - 11pm\nLocation: Dhaka");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[0]));

                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("two"))
        {
            imgDoctor.setImageResource(R.drawable.dr_mamun);
            txtName.setText("Dr.Mamun");
            txtDesc.setText("Dental Specialist\nTime:8pm - 11pm\nLocation: Chittagong");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[1]));

                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("three"))
        {
            imgDoctor.setImageResource(R.drawable.dr_sadia);
            txtName.setText("Dr.Sadia");
            txtDesc.setText("Child Specialist\nTime:8pm - 11pm\nLocation: Comilla");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[2]));

                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("four"))
        {
            imgDoctor.setImageResource(R.drawable.dr_nadia);
            txtName.setText("Dr.Nadia");
            txtDesc.setText("Surgery Specialist\nTime:8pm - 11pm\nLocation: Khulna");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[3]));

                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }

    }



}
