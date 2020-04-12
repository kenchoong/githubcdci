package upuphere.com.githubcdci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAbc();
    }

    private void showAbc(){
        Toast.makeText(this, "ABC 123", Toast.LENGTH_SHORT).show();
    }
}
