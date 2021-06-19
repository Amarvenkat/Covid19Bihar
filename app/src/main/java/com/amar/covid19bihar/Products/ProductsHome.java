package com.amar.covid19bihar.Products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.amar.covid19bihar.R;

public class ProductsHome extends AppCompatActivity {

    CardView productbuycard,productsellcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_home);

        productbuycard = (CardView) findViewById(R.id.productbuycard);
        productsellcard = (CardView) findViewById(R.id.productsellcard);

        productbuycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductsHome.this,ProductBuyCard.class);
                startActivity(intent);
            }
        });
        productsellcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductsHome.this,ProductSellCard.class);
                startActivity(intent);

            }
        });

    }
}
