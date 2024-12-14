import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class IopActivity extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_iop);
        final VideoView videoView = (VideoView) findViewById(R.id.vvIf);
        Uri parse = Uri.parse("android.resource://com.hassilproject.pemrogramandasarportabel/2131427328");
        try {
            videoView.setMediaController(new MediaController(this));
            videoView.setVideoURI(parse);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                videoView.seekTo(0);
                System.out.println("vidio is ready for playing");
                videoView.start();
            }
        });
    }
}
