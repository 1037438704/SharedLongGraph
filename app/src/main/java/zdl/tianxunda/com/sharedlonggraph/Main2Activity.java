package zdl.tianxunda.com.sharedlonggraph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        Toast.makeText(this, url, Toast.LENGTH_SHORT).show();
        image = findViewById(R.id.image);
        Glide.with(Main2Activity.this).load(url).into(image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
