package anew.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();

    }
    TextView tv;
    public int i=1,j,val=0,len,dob=0;
    public char arr[]=new char[100],sug;
public  String s;
    public double st1,st2,sum,no[]=new double[100];
    public void addListnerOnButton()
    {
                Button a2 = (Button) findViewById(R.id.num2);
                Button a3 = (Button) findViewById(R.id.num3);
                Button a4 = (Button) findViewById(R.id.num4);
                Button a5 = (Button) findViewById(R.id.num5);
                Button a6 = (Button) findViewById(R.id.num6);
                Button a7 = (Button) findViewById(R.id.num7);
                Button a8 = (Button) findViewById(R.id.num8);
                Button a9 = (Button) findViewById(R.id.num9);
                Button a0 = (Button) findViewById(R.id.num0);
        Button a1 = (Button) findViewById(R.id.num1);

        Button b1 = (Button) findViewById(R.id.op1);
        Button b2 = (Button) findViewById(R.id.op2);
        Button b3 = (Button) findViewById(R.id.op3);
        Button b4 = (Button) findViewById(R.id.op4);
        Button b5 = (Button) findViewById(R.id.op5);
        Button b6 =(Button) findViewById(R.id.point);
        Button b7 =(Button) findViewById(R.id.clear);
////////////////////////////////////////////////////////////////

        TextView tv=(TextView)findViewById(R.id.textView);
        b7.setOnLongClickListener(new View.OnLongClickListener()
                                  {
                                      @Override
                                      public boolean onLongClick(View view) {
                                          TextView tv=(TextView)findViewById(R.id.textView);
                                          TextView tv2=(TextView)findViewById(R.id.textView2);
                                          tv2.setText("");
                                          tv.setText("");
                                          return true;
                                      }


                                  }
        );




            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView tv = (TextView) findViewById(R.id.textView);
                    String str = tv.getText().toString();
                    TextView tv2=(TextView)findViewById(R.id.textView2);
                    s=tv.getText().toString();
                    if(s.length()==1)
                    {
                        tv2.setText("");
                    }
                    int p = str.length() - 1;
                    if (str.length()==1||str.length()==0||str==null)
                        tv.setText("");
                    else {
                        String strsub = str.substring(0, p);

                        tv.setText(strsub);
                    }
                    String s1,s2;
                    val=0;
                    tv=(TextView)findViewById(R.id.textView);
                    str = tv.getText().toString();
                    for(i=0;i<str.length();i++)
                    {
                        if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                        {


                            if(val==0)
                            {
                                if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                                {
                                    s1=str.substring(0,i+1);
                                    val=1;
                                    j=i;sug=str.charAt(i);
                                    st1=Double.parseDouble(s1);
                                    tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                                }
                                else
                                {
                                    s1=str.substring(0,i);
                                    st1=Double.parseDouble(s1);
                                    val=1;
                                    j=i;sug=str.charAt(i);
                                    tv2.setText(Double.toString(st1));}
                            }
                            else
                            {
                                if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                                {
                                    s2=str.substring(j+1,i+1);
                                    st2=Double.parseDouble(s2);val=1;j=i;
                                    //tv2.setText(Double.toString(st2));
                                    switch(sug)
                                    {
                                        case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                        case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                        case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                        case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                    }
                                }
                                else{
                                    s2=str.substring(j+1,i);
                                    st2=Double.parseDouble(s2);val=1;j=i;
                                    //tv2.setText(Double.toString(st2));
                                    switch(sug)
                                    {
                                        case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                        case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                        case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                        case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                    }
                                    sug=str.charAt(i);
                                }
                            }
                        }

                    }
                    str = null;

                }
            });

        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                TextView tv2=(TextView)findViewById(R.id.textView2);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                if (str.length()==0||str==null)
            {
                tv.setText(".");
            }
                else if(str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/'||str.charAt(str.length()-1)=='.')
                   {

                       tv.setText(str.substring(0,str.length()-1)+".");
                   }
                   else
                tv.setText(str+".");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                str = tv.getText().toString();
                for(i=0;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv=(TextView)findViewById(R.id.textView);
                TextView tv2=(TextView)findViewById(R.id.textView2);
                String str = tv.getText().toString();

                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                if (str.length()==0||str==null)
                {
                    tv.setText("");
                }
                else if(str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
                {
                    tv.setText(str.substring(0,str.length()-1)+"+");
                }

                else
                    tv.setText(str+"+");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv=(TextView)findViewById(R.id.textView);
                TextView tv2=(TextView)findViewById(R.id.textView2);
                String str = tv.getText().toString();

                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                if (str.length()==0||str==null)
                {
                    tv.setText("");
                }
                else if(str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
                {
                    tv.setText(str.substring(0,str.length()-1)+"*");
                }
                else
                    tv.setText(str+"*");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv=(TextView)findViewById(R.id.textView);
                TextView tv2=(TextView)findViewById(R.id.textView2);
                String str = tv.getText().toString();

                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }

                if (str.length()==0||str==null)
            {
                tv.setText("");
            }
                else if(str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
                {
                    tv.setText(str.substring(0,str.length()-1)+"/");
                }

                else
                    tv.setText(str+"/");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            TextView tv=(TextView)findViewById(R.id.textView);
                TextView tv2=(TextView)findViewById(R.id.textView2);
            tv.setText(tv2.getText().toString());
            }











        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv=(TextView)findViewById(R.id.textView);
                TextView tv2=(TextView)findViewById(R.id.textView2);
                String str = tv.getText().toString();
                if (str.length()==0||str==null)
                {
                    tv.setText("");
                }
                else if(str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
                {
                    tv.setText(str.substring(0,str.length()-1)+"-");
                }
                else

                    tv.setText(str+"-");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }

            }
        });
//////////////////////////////////////////////////////////////////////
        a1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"1");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }

            }
        });
        a2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"2");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }

            }
        });
        a3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"3");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"4");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"5");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"6");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"7");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"8");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=1;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }
                tv.setText(tv.getText().toString()+"9");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=0;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });
        a0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView tv2=(TextView)findViewById(R.id.textView2);
                TextView tv=(TextView)findViewById(R.id.textView);
                s=tv.getText().toString();
                if(s.length()==0||s==null)
                {
                    tv2.setText("");
                }

                tv.setText(tv.getText().toString()+"0");
                String s1,s2;
                val=0;
                tv=(TextView)findViewById(R.id.textView);
                String str = tv.getText().toString();
                for(i=0;i<str.length();i++)
                {
                    if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==(str.length()-1))
                    {


                        if(val==0)
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s1=str.substring(0,i+1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                st1=Double.parseDouble(s1);
                                tv2.setText(Double.toString(st1));
                            /*switch(sug)
                            {
                                case '+':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '-':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '*':st1=st1+st2;tv2.setText(Double.toString(st1));break;
                                case '/':st1=st1+st2;tv2.setText(Double.toString(st1));break;

                            }sug=str.charAt(i);j=i;*/
                            }
                            else
                            {
                                s1=str.substring(0,i);
                                st1=Double.parseDouble(s1);
                                val=1;
                                j=i;sug=str.charAt(i);
                                tv2.setText(Double.toString(st1));}
                        }
                        else
                        {
                            if(i==(str.length()-1)&&str.charAt(i)!='+'&&str.charAt(i)!='-'&&str.charAt(i)!='*'&&str.charAt(i)!='/')
                            {
                                s2=str.substring(j+1,i+1);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                            }
                            else{
                                s2=str.substring(j+1,i);
                                st2=Double.parseDouble(s2);val=1;j=i;
                                //tv2.setText(Double.toString(st2));
                                switch(sug)
                                {
                                    case '+':st1=st1+st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '-':st1=st1-st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '*':st1=st1*st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;
                                    case '/':st1=st1/st2;tv2.setText(Double.toString(st1));sug=str.charAt(i);break;

                                }
                                sug=str.charAt(i);
                            }
                        }
                    }

                }
            }
        });






        }

    }

