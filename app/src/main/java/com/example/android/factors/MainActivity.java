package com.example.android.factors;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    int option_no;
    int randfactor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        TextView ans = (TextView) findViewById(R.id.answer);
        ans.setText("");
        int count=0;
        EditText editText=findViewById(R.id.number);
        String temp=editText.getText().toString();
        int num2=1;
        if(temp.equals("")) {
            num2=0;
        }
        if (num2==0){
            TextView err2 = (TextView) findViewById(R.id.answer);
            err2.setText("Invalid input");
        }
        else {
            int num;
            double num1;
            num1 = Double.parseDouble(temp);
            if ((num1 <= 1) || (num1 >= 2147483647)) {
                TextView err = (TextView) findViewById(R.id.answer);
                err.setText("Invalid input");
            } else {
                num = Integer.parseInt(temp);
                for (int i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                Random rand = new Random();
                int r = rand.nextInt(count) + 1;
                for (int i = 1; r > 0; i++) {
                    if (num % i == 0) {
                        --r;
                        if (r == 0)
                            randfactor = i;
                    }
                }
                if (randfactor == 1)
                    randfactor = num;

                Random random = new Random();
                option_no = random.nextInt(3) + 1;
                change1(randfactor, num);
                change2(randfactor, num);
                change3(randfactor, num);
            }
        }
    }
     public void change1(int rf, int num) {
         if (option_no == 1) {
             Button p1_button = (Button) findViewById(R.id.option1);
             p1_button.setText(String.valueOf(rf));
         } else {
             Random ra1 = new Random();
             int r1 = ra1.nextInt(rf+rf) + 3;
                 for(int i=0;; i++){
                     if(num%(r1+i)!=0) {
                         r1 = r1 + i;
                         break;
                     }
                 }
             Button p1_button = (Button) findViewById(R.id.option1);
             p1_button.setText(String.valueOf(r1));
         }
     }

     public void change2(int rf, int num) {
         if (option_no == 2) {
             Button p2_button = (Button) findViewById(R.id.option2);
             p2_button.setText(String.valueOf(rf));
         } else {
             Random ra2 = new Random();
             int r2 = ra2.nextInt(rf+rf) + 3;
                 for(int i=0;; i++) {
                     if (num%(r2+i) != 0) {
                         r2 = r2 + i;
                         break;
                     }
                 }
             Button p2_button = (Button) findViewById(R.id.option2);
             p2_button.setText(String.valueOf(r2));
         }
     }

     public void change3(int rf, int num){
            if (option_no == 3) {
                Button p3_button = (Button) findViewById(R.id.option3);
                p3_button.setText(String.valueOf(rf));
            }
            else {
                Random ra3 = new Random();
                int r3 = ra3.nextInt(rf+rf) + 3;
                    for(int i=0;; i++){
                        if(num%(r3+i)!=0){
                            r3=r3+i;
                            break;
                        }
                    }
                Button p3_button = (Button) findViewById(R.id.option3);
                p3_button.setText(String.valueOf(r3));
            }
        }

    public void option1(View view) {
        if(option_no==1){
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Right answer!!!");
        }
        else if(option_no==0){
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Press go");
        }
        else{
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Wrong answer :(...The right answer is "+String.valueOf(randfactor));
        }
        option_no=0;

    }
    public void option2(View view) {
        if(option_no==2){
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Right answer!!!");
        }
        else if(option_no==0){
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Press go");
        }
        else{
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Wrong answer :(...The right answer is "+String.valueOf(randfactor));
        }
        option_no=0;

    }
    public void option3(View view) {
        if(option_no==3){
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Right answer!!!");
        }
        else if(option_no==0){
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Press go");
        }
        else{
            TextView ans = (TextView) findViewById(R.id.answer);
            ans.setText("Wrong answer :(...The right answer is "+String.valueOf(randfactor));
        }
        option_no=0;

    }

}
