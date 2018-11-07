package zdl.tianxunda.com.sharedlonggraph;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ScrollView scro;
    private Button button;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        button = findViewById(R.id.button);
        image = findViewById(R.id.image);
        linearLayout = findViewById(R.id.linearLayout);
        scro = findViewById(R.id.scro);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = BitmapViewUtils.getBitmapByView(scro);//contentLly是布局文件
                String s = BitmapViewUtils.saveBitmap(MainActivity.this, bitmap);
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("url",s);
//                startActivity(intent);
//                image.setImageBitmap(bitmap);
                Glide.with(MainActivity.this).load(s).into(image);
            }
        });
    }
}
