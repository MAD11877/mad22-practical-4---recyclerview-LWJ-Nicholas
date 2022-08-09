package sg.edu.np.mad.s10222425_practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView img = findViewById(R.id.imageView3);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("This is an AlertDialog");
        builder.setMessage("Please choose an option below");
        builder.setCancelable( false );
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String randInt = Integer.toString(new Random().nextInt(10000000) + 10000000);
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("randInt",randInt);
                startActivity(intent);
            }
        }).setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.show();

            }
        });
    }
}