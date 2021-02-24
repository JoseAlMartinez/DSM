package sv.edu.udb.guia4_discusion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPersonName2);
    }

    public void Enviar(View view) {
        try {
            Intent i = new Intent(this, Resultado.class);
            double salario;
            double isss;
            double afp;
            double renta;
            int horas = Integer.parseInt(et2.getText().toString());
            double totalPagar = 0.00;

            salario = (horas*8.50);
            isss = (salario*0.02);
            afp = (salario*0.03);
            renta = (salario*0.04);
            totalPagar = (salario - (isss + afp + renta));

            i.putExtra("nombre", et1.getText().toString());
            i.putExtra("salario", Double.toString(salario));
            i.putExtra("isss", Double.toString(isss));
            i.putExtra("afp", Double.toString(afp));
            i.putExtra("renta", Double.toString(renta));
            i.putExtra("total", Double.toString(totalPagar));
            startActivity(i);

            Log.d("PRUEBA", Double.toString(salario));

        } catch (Exception error1) {
            Toast.makeText(getApplicationContext(), "No se permiten campos vacios", Toast.LENGTH_SHORT).show();
        }
    }
}