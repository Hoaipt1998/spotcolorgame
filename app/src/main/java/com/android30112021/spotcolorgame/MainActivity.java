package com.android30112021.spotcolorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mtv1, mtv2, mtv3, mtv4, mtv5, mtv6, mtv7, mtv8, mtv9, mtv10, mtv11, mtv12, mtv13, mtv14, mtv15, mtv16, mtvRetry, mtvScore, mtvlevel;
    String[] arrColor = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    String red1 = "";
    String red2 = "";
    String green1 = "";
    String green2 = "";
    String blue1 = "";
    String blue2 = "";
    String colorDefault = "";
    String mtv="mtv" ;
    boolean isRed = false;
    Random random = new Random();
    int Maukhac;
    int IndexColor;
    int Score = 0;
    int Retry = 3;
    int level1 = 1;
    int level0 = 0;
    int Score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddInit();
        RandomClick();
        RandomColor();
        CheckRetry();


        mtv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 1) {
                    Score++;
                } else {
                    ShowOrther();

                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();

            }
        });
        mtv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 2) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 3) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 4) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 5) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 6) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 7) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 8) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 9) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 10) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 11) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 12) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 13) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 14) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 15) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();


            }
        });
        mtv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Maukhac == 16) {
                    Score++;
                } else {
                    ShowOrther();
                    Retry--;
                }
                uplevel(Score);
                RandomClick();
                RandomColor();
                CheckRetry();
            }

        });




    }

    private void ShowOrther() {
        Toast.makeText(MainActivity.this,  "Ô đúng là : " + Maukhac, Toast.LENGTH_SHORT).show();



    }

    private int uplevel(int score) {
        if(Score  - Score1 == 8)
        {
            level1= level1;
            level1++;
            Score1 = Score;
        }
        return level1;
    }

    private void RandomColor() {
        int indexRed1 = random.nextInt(arrColor.length);
        int indexRed2 = random.nextInt(arrColor.length);
        int indexGreen1 = random.nextInt(arrColor.length);
        int indexGreen2 = random.nextInt(arrColor.length);
        int indexBlue1 = random.nextInt(arrColor.length);
        int indexBlue2 = random.nextInt(arrColor.length);

        red1 = arrColor[indexRed1];
        red2 = arrColor[indexRed2];

        green1 = arrColor[indexGreen1];
        green2 = arrColor[indexGreen2];

        blue1 = arrColor[indexBlue1];
        blue2 = arrColor[indexBlue2];

        colorDefault = String.format("#%s%s%s%s%s%s", red1, red2, green1, green2, blue1, blue2);
        if(level1 > 8)
        {
            isRed = true;
        }


        String redColor = reverseIndexColor(indexRed1, indexRed2, level1, isRed);
        String greenColor = reverseIndexColor(indexGreen1, indexGreen2, level1, false);
        String blueColor = reverseIndexColor(indexBlue1, indexBlue2, level1, false);
        String colorReverse = String.format("#%s%s%s", redColor, greenColor, blueColor);


        mtv1.setBackgroundColor(Color.parseColor(colorDefault));
        mtv2.setBackgroundColor(Color.parseColor(colorDefault));
        mtv3.setBackgroundColor(Color.parseColor(colorDefault));
        mtv4.setBackgroundColor(Color.parseColor(colorDefault));
        mtv5.setBackgroundColor(Color.parseColor(colorDefault));
        mtv6.setBackgroundColor(Color.parseColor(colorDefault));
        mtv7.setBackgroundColor(Color.parseColor(colorDefault));
        mtv8.setBackgroundColor(Color.parseColor(colorDefault));
        mtv9.setBackgroundColor(Color.parseColor(colorDefault));
        mtv10.setBackgroundColor(Color.parseColor(colorDefault));
        mtv11.setBackgroundColor(Color.parseColor(colorDefault));
        mtv12.setBackgroundColor(Color.parseColor(colorDefault));
        mtv13.setBackgroundColor(Color.parseColor(colorDefault));
        mtv14.setBackgroundColor(Color.parseColor(colorDefault));
        mtv15.setBackgroundColor(Color.parseColor(colorDefault));
        mtv16.setBackgroundColor(Color.parseColor(colorDefault));

        if(Maukhac == 1) {
            mtv1.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 2)
        {
            mtv2.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 3)
        {
            mtv3.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 4)
        {
            mtv4.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 5)
        {
            mtv5.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 6)
        {
            mtv6.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 7)
        {
            mtv7.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 8)
        {
            mtv8.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 9)
        {
            mtv9.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 10)
        {
            mtv10.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 11)
        {
            mtv11.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 12)
        {
            mtv12.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 13)
        {
            mtv13.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 14)
        {
            mtv14.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else if(Maukhac == 15)
        {
            mtv15.setBackgroundColor(Color.parseColor(colorReverse));
        }
        else
        {
            mtv16.setBackgroundColor(Color.parseColor(colorReverse));
        }

    }

    private void CheckRetry() {
        if(Retry <=0)
        {
            Toast.makeText(MainActivity.this,  "Hết lượt Rồi Điểm của bạn là : " + Score, Toast.LENGTH_SHORT).show();
            Score =0;
            Retry =3;
        }

        mtvScore.setText("Score "+ Score);
        mtvRetry.setText("Retry "+ Retry);
        mtvlevel.setText("Level " + level1);

    }


    private void RandomClick() {
        Maukhac = random.nextInt(15)+1;
        Log.d("BBB", "o thu" + Maukhac);
    }

    private String reverseIndexColor(int indexColor, int indexColor2, int level, boolean isRed) {
        String color = "";
        int color1 = indexColor;
        int color2 = indexColor2;
        String[] arr1 = {"0", "1", "2", "3", "4", "5", "6", "7"};
        String[] arr2 = {"8", "9", "a", "b", "c", "d", "e", "f"};
        if (level > 0 && level < 9) {
            int index = 8 - level + 1;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arrColor[indexColor]) {
                    color1 += index;
                }
                if (arr1[i] == arrColor[indexColor2]) {
                    color2 += index;
                }

            }
            for (int y = 0; y < arr2.length; y++) {
                if (arr2[y] == arrColor[indexColor]) {
                    color1 -= index;
                }
                if (arr2[y] == arrColor[indexColor2]) {
                    color2 -= index;
                }
            }
            color = arrColor[color1] + "" + arrColor[color2];
            return color;
        } else {
            if (isRed && level < 29) {
                color = arrColor[indexColor] + arrColor[indexColor2];
                for (int i = 0; i < 20; i++) {
                    if (i == 0 && level == 9) {
                        return "0D" + color;
                    } else if (i == 1 && level == 10) {
                        return "1A" + color;
                    } else if (i == 1 && level == 11) {
                        return "26" + color;
                    } else if (i == 1 && level == 12) {
                        return "33" + color;
                    } else if (i == 1 && level == 13) {
                        return "40" + color;
                    } else if (i == 1 && level == 14) {
                        return "4D" + color;
                    } else if (i == 1 && level == 15) {
                        return "59" + color;
                    } else if (i == 1 && level == 16) {
                        return "66" + color;
                    } else if (i == 1 && level == 17) {
                        return "73" + color;
                    } else if (i == 1 && level == 18) {
                        return "80" + color;
                    } else if (i == 1 && level == 19) {
                        return "8C" + color;
                    } else if (i == 1 && level == 20) {
                        return "99" + color;
                    } else if (i == 1 && level == 22) {
                        return "A6" + color;
                    } else if (i == 1 && level == 23) {
                        return "B3" + color;
                    } else if (i == 1 && level == 24) {
                        return "BF" + color;
                    } else if (i == 1 && level == 25) {
                        return "CC" + color;
                    } else if (i == 1 && level == 26) {
                        return "D9" + color;
                    } else if (i == 1 && level == 27) {
                        return "E6" + color;
                    } else if (i == 1 && level == 28) {
                        return "F2" + color;
                    }
                }
            } else {
                color = arrColor[indexColor] + arrColor[indexColor2];
            }
        }
        return color;
    }


    private void AddInit() {
        mtv1 = findViewById(R.id.tv1);
        mtv2 = findViewById(R.id.tv2);
        mtv3 = findViewById(R.id.tv3);
        mtv4 = findViewById(R.id.tv4);
        mtv5 = findViewById(R.id.tv5);
        mtv6 = findViewById(R.id.tv6);
        mtv7 = findViewById(R.id.tv7);
        mtv8 = findViewById(R.id.tv8);
        mtv9 = findViewById(R.id.tv9);
        mtv10 = findViewById(R.id.tv10);
        mtv11 = findViewById(R.id.tv11);
        mtv12 = findViewById(R.id.tv12);
        mtv13 = findViewById(R.id.tv13);
        mtv14 = findViewById(R.id.tv14);
        mtv15 = findViewById(R.id.tv15);
        mtv16 = findViewById(R.id.tv16);
        mtvRetry = findViewById(R.id.textviewRetry);
        mtvScore = findViewById(R.id.textviewScore);
        mtvlevel = findViewById(R.id.tvlevel);
    }
}