package kr.co.dothome.ib1694.subject;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class MusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_video);

        VideoView Video = (VideoView)this.findViewById(R.id.videoView);
        final MediaController mc = new MediaController(this);
        Video.setMediaController(mc);
        String sdcard = Environment.getExternalStorageDirectory().getAbsolutePath();

        Video.setVideoPath("/storage/emulated/0/교과동영상/음악.mp4");
        Video.requestFocus();
        mc.hide();
        Video.start();

        Video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
