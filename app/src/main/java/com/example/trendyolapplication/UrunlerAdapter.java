package com.example.trendyolapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.trendyolapplication.databinding.CardTasarimBinding;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UrunlerAdapter extends RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>{
    private Context mContext;
    private List<Urunler>urunlerListesi;


    public UrunlerAdapter(Context mContext, List<Urunler> urunlerListesi) {
        this.mContext = mContext;
        this.urunlerListesi = urunlerListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            CardTasarimBinding binding =
                    CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
            return new CardTasarimTutucu(binding);
        }



    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Urunler urun = urunlerListesi.get(position);
        CardTasarimBinding t = holder.binding;

        t.imageViewUrun.setImageResource(mContext.getResources().getIdentifier(urun.getResimAdi(),"drawable",mContext.getPackageName()));
        t.textViewAciklama.setText(urun.getAciklama());
        t.textViewFiyat.setText(urun.getFiyat()+" ₺");//fiyatlandırma
    }

    @Override
    public int getItemCount() {
        return urunlerListesi.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;
        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


    }

}






