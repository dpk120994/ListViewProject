package com.example.sourcekode1.listviewproject;



        import android.Manifest;
        import android.app.LauncherActivity;
        import android.content.ClipData;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.net.Uri;
        import android.support.v4.app.ActivityCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.telecom.Call;
        import android.telephony.SmsManager;
        import android.view.ContextMenu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {


    String[] data = {
            "C Language",
            "Core Java",
            "PHP",
            "Advanced Java",
            "Asp.net",
            "R",
            "Python",
            "RubyonRails",
            "C++",
            "Swift",
            "C#",
            "React",
            "Spring",
            "AngluarJs",
            "Spring Hibernate",
            "Html",
            "Css"};
    String []subList;
    ArrayAdapter adapter;
    ListView listView;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "OnCreate has been called", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        adapter = new ArrayAdapter(this, R.layout.mylist, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        //registerForContextMenu(listView);//used to register our menu with our listView


    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        //Toast.makeText(this, "" + data[i], Toast.LENGTH_SHORT).show();

        /* if(adapterView.getAdapter().getItem(i).toString().equals("C Language")) ;
        Toast.makeText(this, "YIP YIP HURRAY", Toast.LENGTH_SHORT).show();*/
        showSubList(data[i]);

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "LONG CLICK " + data[i], Toast.LENGTH_SHORT).show();
        position=i;


        return false;
    }

   /*@Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("SELECT OPTIONS");
        menu.add(0, 1, 1, "CALL");
        menu.add(0, 2, 2, "SMS");
    }*/
    //this method is to create our Context menu, here we have not changed any of the parameteres

    public String showSubList(String b)
    {
        String c=null;
        String a[];
        Intent intent;
        switch (b)
        {
            case "C Language":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;

            case "Core Java":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;

            case  "PHP":

                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case  "Advanced Java":
                intent =new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Asp.net":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "R":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Python":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "RubyonRails":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "C++":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Swift":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "C#":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "React":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Spring":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "AngluarJs":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Spring Hibernate":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Html":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            case "Css":
                intent=new Intent(MainActivity.this,Main2Activity.class);
                a= new String[]{"deepak", "Parashar"};
                subList=a;
                intent.putExtra("name",subList);
                startActivity(intent);
                break;
            default:
                break;
        }
        return c;
    }

}