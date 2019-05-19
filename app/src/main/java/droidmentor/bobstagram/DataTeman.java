/*  Tanggal Pengerjaan : 19 Mei 2019
    NIM   : 10116334
    Nama  : Boby Maulana Subagja
    Kelas : IF-8
 */

package droidmentor.bobstagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import droidmentor.bobstagram.Friends.Teman;

public class DataTeman extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ViewAdapter adapter;
    private ArrayList<Teman> temanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new ViewAdapter(temanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DataTeman.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }


    void addData(){
        temanArrayList = new ArrayList<>();
        temanArrayList.add(new Teman("10116358", "Dzulfikar Miandro", "IF-8", "084567745896", "dzulfikar@gmail.com", "@Dzulfikar"));
        temanArrayList.add(new Teman("10116333", "Chandra Septian", "IF-8", "0845654789652", "chandra@gmail.com", "@Chandra"));
    }

}
