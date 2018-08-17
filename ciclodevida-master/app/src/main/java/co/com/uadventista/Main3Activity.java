package co.com.uadventista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @BindView(R.id.spinner1)
    public Spinner spinner1;

    @BindView(R.id.spinner2)
    public Spinner spinner2;

    @BindView(R.id.spinner3)
    public Spinner spinner3;

    ArrayAdapter <String> University,pregrado,Tiempo,Tiempo2;

    String [] universidad = {"Adventista","Eafit"};
    String [] carrera = {"IngeneriaSistemas","Contaduria"};
    String [] duracion = {"1","2","3","4","5","6","7","8","9","10"};
    String [] duracion2 = {"1","2","3","4","5","6","7","8"};
    int pos1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);


        University = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,universidad);
        spinner1.setAdapter(University);
        pregrado = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,carrera);
        Tiempo= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,duracion);
        Tiempo2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,duracion2);

    }

    @Override
    public void onItemSelected(AdapterView<?> a, View v, int p, long l) {
        String valor = spinner1.getSelectedItem().toString();
        switch (a.getId()) {
            case R.id.spinner1:

                switch (p) {
                    case 0:
                        spinner2.setAdapter(pregrado);
                        spinner3.setAdapter(Tiempo);

                        break;
                    case 1:
                        spinner2.setAdapter(pregrado);
                        break;
                }

            case R.id.spinner2:
                switch (p) {
                    case 0:
                        String valor1 = spinner2.getSelectedItem().toString();
                        if (valor1.equals("IngeneriaSistemas") && (valor.equals("Eafit"))) {
                            spinner3.setAdapter(Tiempo);
                            break;
                        }

                    case 1:
                        String valor2 = spinner2.getSelectedItem().toString();
                        if (valor2.equals("Contaduria") && valor.equals("Eafit")) {
                            spinner3.setAdapter(Tiempo2);
                            break;
                        }
                        break;
                }
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
