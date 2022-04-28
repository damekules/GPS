package com.example.gps;

//import
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;




//navigation code
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button navigateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateBtn = findViewById(R.id.navigateBtn);
        navigateBtn.setOnClickListener(this);
    }


//forcing location to be MSU
    @Override
    public void onClick(View v) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}