package com.example.trendyolapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.MenuInflater;

import com.example.trendyolapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ArrayList<Urunler>urunlerListesi = new ArrayList<>();
        Urunler u1= new Urunler(1,"TrendyolMilla Mavi Blazer","blazer",599.99);
        Urunler u2= new Urunler(2,"Koton Krem Uzun Kaban","kaban",799.99);
        Urunler u3= new Urunler(3,"Defacto Kırmızı Kaban","kaban2",499.99);
        Urunler u4= new Urunler(4,"Batik Kahverengi Mont","mont1",699.99);
        Urunler u5= new Urunler(5,"Mango Siyah Şişme Mont","mont2",799.99);
        Urunler u6= new Urunler(6,"Mavi Kırmızı Sweatshirt","sweatshirt",399.99);

        urunlerListesi.add(u1);
        urunlerListesi.add(u2);
        urunlerListesi.add(u3);
        urunlerListesi.add(u4);
        urunlerListesi.add(u5);
        urunlerListesi.add(u6);
        UrunlerAdapter adapter = new UrunlerAdapter(this,urunlerListesi);
        binding.rv.setAdapter(adapter);






    }
}