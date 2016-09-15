package paulo.android.gitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GitExampleActivity extends AppCompatActivity {

    Button btnGit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.git_example);

        btnGit1 = (Button)findViewById(R.id.btnGit1);
        btnGit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GitExampleActivity.this, GitActivity2.class));
                finish();
            }
        });


    }
}
