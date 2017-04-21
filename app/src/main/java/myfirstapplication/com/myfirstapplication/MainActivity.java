package myfirstapplication.com.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"in OnCreate");
        setListener();
    }

    private void setListener(){
        Button showToast= (Button)findViewById(R.id.buttonToast);
        showToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Hi There !!", Toast.LENGTH_LONG);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"in onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"in OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"in OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"in OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"in OnPause");
    }

    public void showToast(View view) {
        Toast.makeText(this,"Hi There!!", Toast.LENGTH_LONG)
        .show();
    }

}
