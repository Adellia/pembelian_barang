package id.sch.smktelkom_mlg.tugas01.xiirpl3017.pembelian_barang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etTlp;
    EditText etAlm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editNama);
        etTlp = (EditText) findViewById(R.id.editTlp);
        etAlm = (EditText) findViewById(R.id.editAlm);

    }
}
