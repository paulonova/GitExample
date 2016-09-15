package paulo.android.gitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GitActivity2 extends AppCompatActivity {

    Button btnGit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git2);

        btnGit2 = (Button)findViewById(R.id.btnGit2);
        btnGit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GitActivity2.this, GitExampleActivity.class));
                finish();
            }
        });
    }
}
