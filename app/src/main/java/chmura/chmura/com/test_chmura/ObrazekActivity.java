package chmura.chmura.com.test_chmura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ObrazekActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrazek);
        mTextMessage = (TextView) findViewById(R.id.message);
        //String text = "sukces ";
        //mTextMessage.setText(text);

        mImageView = (ImageView) findViewById(R.id.imageView1);
        mImageView.setImageResource(R.drawable.kielce2);
    }
}
