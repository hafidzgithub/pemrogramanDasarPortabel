import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MateriActivity extends AppCompatActivity {
    ImageView ivArray;
    ImageView ivIop;
    ImageView ivMethod;
    ImageView ivPerulangan;
    ImageView ivSk;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_materi);
        this.ivIop = (ImageView) findViewById(R.id.ivIop);
        this.ivIop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MateriActivity.this.startActivity(new Intent(MateriActivity.this, IopActivity.class));
            }
        });
        this.ivSk = (ImageView) findViewById(R.id.ivSk);
        this.ivSk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MateriActivity.this.startActivity(new Intent(MateriActivity.this, animasiIfActivity.class));
            }
        });
        this.ivPerulangan = (ImageView) findViewById(R.id.ivPerulangan);
        this.ivPerulangan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MateriActivity.this.startActivity(new Intent(MateriActivity.this, PerulanganActivity.class));
            }
        });
        this.ivArray = (ImageView) findViewById(R.id.ivArray);
        this.ivArray.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MateriActivity.this.startActivity(new Intent(MateriActivity.this, ArrayActivity.class));
            }
        });
        this.ivMethod = (ImageView) findViewById(R.id.ivMethod);
        this.ivMethod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MateriActivity.this.startActivity(new Intent(MateriActivity.this, MethodActivity.class));
            }
        });
    }
}
