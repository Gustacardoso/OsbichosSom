package empresasconsultoria.gcsapps.com.osbichossom;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{
    private ImageView imageButtonCao;
    private ImageView imageButtonGato;
    private ImageView imageButtonLeao;
    private ImageView imageButtonMacaco;
    private ImageView imageButtonOvelha;
    private ImageView imageButtonVaca;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     imageButtonCao = findViewById(R.id.cao);
     imageButtonGato = findViewById(R.id.gato);
     imageButtonLeao = findViewById(R.id.leao);
     imageButtonMacaco = findViewById(R.id.macaco);
     imageButtonOvelha = findViewById(R.id.ovelha);
     imageButtonVaca = findViewById(R.id.vaca);

     imageButtonCao.setOnClickListener(this);
     imageButtonGato.setOnClickListener(this);
     imageButtonLeao.setOnClickListener(this);
     imageButtonMacaco.setOnClickListener(this);
     imageButtonOvelha.setOnClickListener(this);
     imageButtonVaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cao:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cao);
                tocarSom();
                break;
            case R.id.gato:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.gato);
                tocarSom();
                break;
            case R.id.leao:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.leao);
                tocarSom();
                break;
            case R.id.macaco:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.macaco);
                tocarSom();
                break;
            case R.id.ovelha:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.ovelha);
                tocarSom();
                break;
            case R.id.vaca:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.vaca);
                tocarSom();
                break;
        }
    }

    private void tocarSom() {
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
