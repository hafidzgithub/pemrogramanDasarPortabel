import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivKeluar;
    ImageView ivMateri;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        this.ivMateri = (ImageView) findViewById(R.id.ivMateri);
        this.ivKeluar = (ImageView) findViewById(R.id.ivKeluar);
        this.ivMateri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, MateriActivity.class));
            }
        });
        this.ivKeluar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.finish();
                System.exit(0);
            }
        });
    }
}
