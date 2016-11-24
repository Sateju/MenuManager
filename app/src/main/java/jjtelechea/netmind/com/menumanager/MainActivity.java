package jjtelechea.netmind.com.menumanager;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ActionMode.Callback ,View.OnLongClickListener{

    private ImageView imageView;
    private ActionMode actionMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        ActionBar mActionBar = getSupportActionBar();
        //mActionBar.setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) findViewById(R.id.image_view_central);
        //registerForContextMenu(imageView);
        imageView.setOnLongClickListener(this);




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

            case R.id.addItem:
                Log.d("Pruebas","entra en add");
                return true;

            case R.id.likeItem:
                Log.d("Pruebas","entra en like");
                return true;

            case R.id.dislikeItem:
                Log.d("Pruebas","entra en dislike");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /*
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater mContentMenuInflater = getMenuInflater();
        mContentMenuInflater.inflate(R.menu.context_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.addItem:
                Log.d("Pruebas","entra en add");
                return true;

            case R.id.likeItem:
                Log.d("Pruebas","entra en like");
                return true;

            case R.id.dislikeItem:
                Log.d("Pruebas","entra en dislike");
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }
    */

    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        MenuInflater mContentMenuInflater = getMenuInflater();
        mContentMenuInflater.inflate(R.menu.context_menu,menu);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode mode) {

    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.image_view_central){
            startSupportActionMode(this);
            return true;
        }else{
            return false;
        }

    }
}
