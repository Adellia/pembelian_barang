package id.sch.smktelkom_mlg.tugas01.xiirpl3017.pembelian_barang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etTlp, etAlm;
    RadioGroup rgBayar;
    Spinner spEksp;
    CheckBox cbMP, cbBC, cbN, cbD;
    TextView tvHasil;
    Button bOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editNama);
        etTlp = (EditText) findViewById(R.id.editTlp);
        etAlm = (EditText) findViewById(R.id.editAlm);

        rgBayar = (RadioGroup) findViewById(R.id.rgroupBayar);

        spEksp = (Spinner) findViewById(R.id.spinnerEks);

        cbMP = (CheckBox) findViewById(R.id.cbMP);
        cbBC = (CheckBox) findViewById(R.id.cbBC);
        cbN = (CheckBox) findViewById(R.id.cbNormal);
        cbD = (CheckBox) findViewById(R.id.cbDoc);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOk = (Button) findViewById(R.id.buttonOK);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });
    }

    private void doProcess() {
    }

}
