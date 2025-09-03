package jp.ac.meijou.android.s241205055;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

import jp.ac.meijou.android.s241205055.databinding.ActivityMain3Binding;
import jp.ac.meijou.android.s241205055.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;
    private String x = "0";
    private String way = "+";
    private int ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        binding.Num1.setOnClickListener(view -> {
            if(x=="0"){
                x="1";
            }else{x = x + "1";}
            binding.Result.setText(x);
        });
        binding.Num2.setOnClickListener(view -> {
            if(x=="0"){
                x="2";
            }else{
            x = x + "2";}
            binding.Result.setText(x);
        });
        binding.Num3.setOnClickListener(view -> {
            if(x=="0"){
                x="3";
            }else{
            x = x + "3";}
            binding.Result.setText(x);
        });
        binding.Num4.setOnClickListener(view -> {
            if(x=="0"){
                x="4";
            }else{
            x = x + "4";}
            binding.Result.setText(x);
        });
        binding.Num5.setOnClickListener(view -> {
            if(x=="0"){
                x="5";
            }else{
            x = x + "5";}
            binding.Result.setText(x);
        });
        binding.Num6.setOnClickListener(view -> {
            if(x=="0"){
                x="6";
            }else{
            x = x + "6";}
            binding.Result.setText(x);
        });
        binding.Num7.setOnClickListener(view -> {
            if(x=="0"){
                x="7";
            }else{
            x = x + "7";}
            binding.Result.setText(x);
        });
        binding.Num8.setOnClickListener(view -> {
            if(x=="0"){
                x="8";
            }else{
            x = x + "8";}
            binding.Result.setText(x);
        });
        binding.Num9.setOnClickListener(view -> {
            if(x=="0"){
                x="9";
            }else{
            x = x + "9";}
            binding.Result.setText(x);
        });
        binding.Num0.setOnClickListener(view -> {
            if(x!=""&&x!="0"){
                x = x + "0";
            }
            binding.Result.setText(x);
        });
        binding.AC.setOnClickListener(view->{
            x = "0";
            ans = 0;
            binding.Result.setText(x);
        });
        binding.Equal.setOnClickListener(view->{
            binding.Result.setText(String.valueOf(ans));
        });
        binding.Plus.setOnClickListener(view->{
            ans = calc(way,Integer.parseInt(x),ans);
            x = "0";
            way = "+";
            binding.Result.setText(String.valueOf(ans));
        });
    }

    private int calc(String way,int x,int y){
        switch (way){
            case "+":
                return x + y;
        }
        return 0;
    }

}