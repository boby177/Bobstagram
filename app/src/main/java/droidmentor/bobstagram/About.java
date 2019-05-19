/*  Tanggal Pengerjaan : 19 Mei 2019
    NIM   : 10116334
    Nama  : Boby Maulana Subagja
    Kelas : IF-8
 */

package droidmentor.bobstagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        Intent intent = getIntent();
    }
}
