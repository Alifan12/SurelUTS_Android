package com.example.sureluts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;
    private Context context;

    public Adapter(Context context, List<ModelClass> userList) {
        //this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource = userList.get(position).getImageView1();
        String name = userList.get(position).getTextView1();
        String date = userList.get(position).getTextView2();
        String subjek = userList.get(position).getTextView3();
        String message = userList.get(position).getTextView4();

        holder.setData(resource, name, date, subjek, message);

        /*holder.parentLayout.setOnClickListener(v ->
        {
            if (userList.get(position).getTextView1().equals("DQLab")){
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("TEXT_DEFAULT", "What is Lorem Ipsum?");
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.person);
                intent.putExtra("TEXT_DEFAULT", "DQLab");
                intent.putExtra("TEXT_DEFAULT", "20:19");
                intent.putExtra("TEXT_DEFAULT", "Kepada saya12@gmail.com");
                intent.putExtra("TEXT_DEFAULT", "What is Lorem Ipsum?\\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\\n\\nWhy do we use it?\\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\\n\\nWhere can I get some?\\nThere are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.\\n\\n");
                context.startActivity(intent);
            }
            if (userList.get(position).getTextView1().equals("Alifa Nailissalwa")) {
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("SUBJEK_DEFAULT", "What is Lorem Ipsum?");
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.person);
                intent.putExtra("SENDER_DEFAULT", "Alifa Nailissalwa");
                intent.putExtra("TIME_DEFAULT", "12 Mar");
                intent.putExtra("TO_DEFAULT", "Kepada saya12@gmail.com");
                intent.putExtra("MESSAGE_DEFAULT", "What is Lorem Ipsum?\\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\\n\\nWhy do we use it?\\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\\n\\nWhere can I get some?\\nThere are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.\\n\\n");
                context.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView1;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private TextView textView4;
        //LinearLayoutCompat parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.imageView1);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            //parentLayout = itemView.findViewById(R.id.parentLayout);
        }

        public void setData(int resource, String name, String date, String subjek, String message) {

            imageView1.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(date);
            textView3.setText(subjek);
            textView4.setText(message);
        }
    }
}
