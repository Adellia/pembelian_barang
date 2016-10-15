package id.sch.smktelkom_mlg.tugas01.xiirpl3017.pembelian_barang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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
        if (isValid()) {
            String nama = etNama.getText().toString();
            int tlp = Integer.parseInt(etTlp.getText().toString());
            String alamat = etAlm.getText().toString();
            String hasil = null;
            if (rgBayar.getCheckedRadioButtonId() != -1) {
                RadioButton rb = (RadioButton) findViewById(rgBayar.getCheckedRadioButtonId());
                hasil = rb.getText().toString();
            }
            String kategori = ". Kategori barang Anda : ";
            int startlen = kategori.length();
            if (cbMP.isChecked()) kategori += cbMP.getText() + ", ";
            if (cbBC.isChecked()) kategori += cbBC.getText() + ", ";
            if (cbN.isChecked()) kategori += cbN.getText() + ", ";
            if (cbD.isChecked()) kategori += cbD.getText() + ". ";

            if (kategori.length() == startlen) kategori += " belum Anda pilih ";

            if (hasil == null) {
                tvHasil.setText("Anda Belum memilih Pembayaran");
            } else {
                tvHasil.setText("Pelanggan " + nama + " jumlah barang yang harus dibayar akan dikirim di " + tlp + ". Metode pembayaran yang dilakukan adalah " + hasil + ". Barang akan dikirim dengan " + spEksp.getSelectedItem().toString() + kategori +
                        ". Mohon lakukan pembayaran 1 x 24 jam. Bila tidak, pesanan Anda akan dibatalkan secara otomatis.");
            }
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String tlp = etTlp.getText().toString();
        String alamat = etAlm.getText().toString();

        if (nama.isEmpty())

        {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Mohon isi nama lengkap");
            valid = false;
        } else {
            etNama.setError(null);
        }

        if (tlp.isEmpty()) {
            etTlp.setError("Nomor Telepon belum diisi");
            valid = false;
        } else {
            etTlp.setError(null);
        }

        if (alamat.isEmpty()) {
            etAlm.setError("Alamat belum diisi");
            valid = false;
        } else {
            etAlm.setError(null);
        }


        return valid;

    }
}
