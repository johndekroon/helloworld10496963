// Name: John de Kroon
// Sn: 10496963

package nl.mprog.apps.Hello10496963;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloooActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellooo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hellooo, menu);
        return true;
    }
    
}
