package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            String Imageindex = bundle.getString("ImageIndex");
            setImage(Imageindex);
        }
    }

    private void setImage(String index)
    {
        ImageView imageView = (ImageView)findViewById(R.id.imageView1);

        switch (index)
        {
            case "1":
                imageView.setImageResource(R.drawable.img);
                break;
            case "2":
                imageView.setImageResource(R.drawable.img_1);
                break;
            case "3":
                imageView.setImageResource(R.drawable.img_2);
                break;
            case "4":
                imageView.setImageResource(R.drawable.img_3);
                break;
            default:
                imageView.setImageResource(R.drawable.img);
        }
    }
}