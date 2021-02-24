package sv.edu.udb.guia4_discusion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView lblSalario;
    private TextView lblIsss;
    private TextView lblApf;
    private TextView lblRenta;
    private TextView lblTotal;
    private TextView lblnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lblnombre = (TextView)findViewById(R.id.textView9);
        lblSalario = (TextView)findViewById(R.id.textView2);
        lblIsss = (TextView)findViewById(R.id.textView3);
        lblApf = (TextView)findViewById(R.id.textView5);
        lblRenta = (TextView)findViewById(R.id.textView6);
        lblTotal = (TextView)findViewById(R.id.textView7);

        String salario = getIntent().getStringExtra("salario");
        String nombre = getIntent().getStringExtra("nombre");
        String isss = getIntent().getStringExtra("isss");
        String afp = getIntent().getStringExtra("afp");
        String renta = getIntent().getStringExtra("renta");
        String total = getIntent().getStringExtra("total");

        lblnombre.setText(nombre + " sus descuentos son");
        lblSalario.setText("Salario $" + salario);
        lblIsss.setText("ISSS $" + isss);
        lblApf.setText("AFP $" + afp);
        lblRenta.setText("RENTA $" + renta);
        lblTotal.setText("Total a pagar $" + total);
    }

    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}