package jjtelechea.netmind.com.menumanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mMenuInflater = this.getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.compareItem:
                Log.d("Pruebas","entra en compare");
                return true;

            case R.id.copyItem:
                Log.d("Pruebas","entra en copy");
                return true;

            case R.id.cutItem:
                Log.d("Pruebas","entra en cut");
                return true;

            case R.id.fileItem:
                Log.d("Pruebas","entra en file");
                return true;

            case R.id.pasteItem:
                Log.d("Pruebas","entra en paste");
                return true;

            case R.id.searchItem:
                Log.d("Pruebas","entra en search");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
