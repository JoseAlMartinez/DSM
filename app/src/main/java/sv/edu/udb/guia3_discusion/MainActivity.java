package sv.edu.udb.guia3_discusion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView mostrarValor;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarValor = (TextView) findViewById(R.id.textUno);
    }

    public void sumarUno(View view){

        contador = Integer.parseInt(mostrarValor.getText().toString());
        Log.i("Error", String.valueOf(contador));
        if(contador >= 0 && contador <=8 ){
            contador++;
            mostrarValor.setText(Integer.toString(contador));
        }else{
            mostrarValor.setText(Integer.toString(0));
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("CONTADOR", mostrarValor.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mostrarValor.setText(savedInstanceState.getString("CONTADOR"));
    }
}