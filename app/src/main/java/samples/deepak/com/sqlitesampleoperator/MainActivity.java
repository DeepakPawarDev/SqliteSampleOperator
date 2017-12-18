package samples.deepak.com.sqlitesampleoperator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import samples.deepak.com.sqlitesampleoperator.Database.DBManager;
import samples.deepak.com.sqlitesampleoperator.Entities.Operator;

public class MainActivity extends AppCompatActivity {


    EditText editTextID,editTextName,editTextShortCode;
    Button buttonAdd,buttonShow;
    DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        dbManager=new DBManager(getApplicationContext());

        initializeComponent();
    }

    private void initializeComponent(){

        editTextID=(EditText)findViewById(R.id.edit_text_id);
        editTextName=(EditText)findViewById(R.id.edit_text_name);
        editTextShortCode=(EditText)findViewById(R.id.edit_text_short_code);
        buttonAdd=(Button)findViewById(R.id.button_insert);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbManager.insertOperator(

                        Integer.parseInt(editTextID.getText().toString().trim()),
                        editTextName.getText().toString().toString(),
                        editTextShortCode.getText().toString().trim()

                );

            }
        });

        buttonShow=(Button)findViewById(R.id.button_show);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Operator> operatorArrayList=dbManager.getOperators();

                for (Operator operator:operatorArrayList){

                    editTextID.setText(""+operator.getOperator_Id());
                    editTextName.setText(operator.getStringOperatorName());
                    editTextShortCode.setText(operator.getStringShortCode());

                }

            }
        });


    }

}
