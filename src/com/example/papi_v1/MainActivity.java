package com.example.papi_v1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.os.Bundle;

import android.app.Activity;

import android.view.Menu;

import android.view.MenuItem;

import android.widget.Toast;

public class MainActivity extends Activity
{
@Override
protected void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}

@Override
public boolean onCreateOptionsMenu(Menu menu)
{
getMenuInflater().inflate(R.menu.main_menu, menu);
return true;
} 

@Override
public boolean onOptionsItemSelected(MenuItem item)
{
super.onOptionsItemSelected(item);
switch(item.getItemId())
{
case R.id.friends:
Toast.makeText(getBaseContext(), "Friends", Toast.LENGTH_SHORT).show();
break;
case R.id.chat:
Toast.makeText(getBaseContext(), "Chat", Toast.LENGTH_SHORT).show();
break;
case R.id.braodcast:
Toast.makeText(getBaseContext(), "Broadcast", Toast.LENGTH_SHORT).show();
break;
case R.id.poster:
Toast.makeText(getBaseContext(), "Posts", Toast.LENGTH_SHORT).show();
break;

}
return true;
}
}



