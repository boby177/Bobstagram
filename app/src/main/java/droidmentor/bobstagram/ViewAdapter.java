/*  Tanggal Pengerjaan : 19 Mei 2019
    NIM   : 10116334
    Nama  : Boby Maulana Subagja
    Kelas : IF-8
 */

package droidmentor.bobstagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import droidmentor.bobstagram.Friends.Teman;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MahasiswaViewHolder> {


    private ArrayList<Teman> dataList;

    public ViewAdapter(ArrayList<Teman> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_chat, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNim, txtNama, txtKelas, txtTelepon, txtEmail, txtSosmed;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNim = (TextView) itemView.findViewById(R.id.nim);
            txtNama = (TextView) itemView.findViewById(R.id.nama);
            txtKelas = (TextView) itemView.findViewById(R.id.kelas);
            txtTelepon = (TextView) itemView.findViewById(R.id.telepon);
            txtEmail = (TextView) itemView.findViewById(R.id.email);
            txtSosmed = (TextView) itemView.findViewById(R.id.telepon);
        }
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtKelas.setText(dataList.get(position).getKelas());
        holder.txtTelepon.setText(dataList.get(position).getTelepon());
        holder.txtEmail.setText(dataList.get(position).getEmail());
        holder.txtSosmed.setText(dataList.get(position).getSosmed());
    }
}
