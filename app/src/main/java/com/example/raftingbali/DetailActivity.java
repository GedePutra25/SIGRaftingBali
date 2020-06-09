package com.example.raftingbali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    TextView datanama, datajambuka, dataharga, datatelepon, dataalamat;
    Button btncall;
    ImageView datagambar;
    public static String id,nama,alamat,tlpn,gambar,jambuka,harga;
    public static Double latitude, longlitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        datajambuka=findViewById(R.id.tv_jambuka);
        dataharga=findViewById(R.id.tv_harga);
        datatelepon=findViewById(R.id.tv_telepon);
        dataalamat=findViewById(R.id.tv_alamat);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        datajambuka.setText(jambuka);
        dataharga.setText(harga);
        datatelepon.setText(tlpn);
        dataalamat.setText(alamat);
        Picasso.get().load(gambar).into(datagambar);
         btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+tlpn));
        startActivity(call);
    }
}
