package co.com.uadventista;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onResume");
    }

    @Override
    protected void onPause() {
        //Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        //Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onRestart");
    }

    @Override
    protected void onDestroy() {
        //Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("CicloVida", "onDestroy");
        super.onDestroy();
    }

    @OnClick(R.id.button)
    public void irActivity2(View view) {
        Intent activity2 = new Intent(getApplicationContext(), Main2Activity.class);
        activity2.putExtra("saludo", "hola clase");
        startActivity(activity2);
    }
}
