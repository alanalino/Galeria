package lino.alana.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Setando o elemento tbMain (ToolBar) como a ActionBar padrão do MainActivity.
        Toolbar toolbar = findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);

        //criando as opções de menu da activity
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            super.onCreateOptionsMenu(menu);
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_activity_tb, menu);
            return true;
        }





            }
}