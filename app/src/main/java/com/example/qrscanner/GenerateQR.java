package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class GenerateQR extends AppCompatActivity {


    private TextView  qrCodeTv;
    private ImageView qrCodeIv;
    private TextInputEditText dataEdt;
    private Button generateQr;

    private QRGEncoder qrgEncoder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_qr);

        qrCodeTv = findViewById(R.id.tvqr);
        qrCodeIv = findViewById(R.id.qrcode);
        dataEdt = findViewById(R.id.idEdtData);
        generateQr = findViewById(R.id.BtnGenerateQR);

        generateQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = dataEdt.getText().toString();
                if(data.isEmpty()){
                    Toast.makeText(GenerateQR.this, "Please enter some data to generate qr code", Toast.LENGTH_SHORT).show();
                }else{
                    WindowManager manger = (WindowManager) getSystemService(WINDOW_SERVICE);
                    Display display = getWindowManager().getDefaultDisplay();
                    Point point =  new Point();
                    display.getSize(point);
                    int width = point.x;
                    int height = point.y;
                    int dimen = width<height  ? width:height;
                    dimen = dimen * 3/4;


                }
            }
        });
    }
}