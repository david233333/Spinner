package co.com.uadventista;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.saludo)
    public TextView saludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, bundle.getString("saludo"), Toast.LENGTH_SHORT).show();
        saludo.setText(bundle.getString("saludo"));
    }
}
