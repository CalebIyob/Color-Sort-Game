package com.example.new_project_1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class HardActivity extends AppCompatActivity {
    Button[] colu1 = new Button[4];
    Button[] colu2 = new Button[4];
    Button[] colu3 = new Button[4];
    Button[] colu4 = new Button[4];
    Boolean putting_down = false;
    ColorStateList topRowColor;
    Button IHB11, IHB12, IHB13, IHB14;
    Button HB11, HB12, HB13, HB14, HB21, HB22, HB23, HB24, HB31, HB32, HB33, HB34, HB41, HB42, HB43, HB44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hard);
        IHB11 = (Button) findViewById(R.id.IHB_11);
        IHB12 = (Button) findViewById(R.id.IHB_12);
        IHB13 = (Button) findViewById(R.id.IHB_13);
        IHB14 = (Button) findViewById(R.id.IHB_14);
        IHB11.setVisibility(View.INVISIBLE);
        IHB12.setVisibility(View.INVISIBLE);
        IHB13.setVisibility(View.INVISIBLE);
        IHB14.setVisibility(View.INVISIBLE);
        Random rand = new Random();
        int redcounter = 0;
        int bluecounter = 0;
        int greencounter = 0;
        int yellowcounter = 0;
        HB11 = (Button) findViewById(R.id.HB1_1);
        boolean open_color_filled_11 = true;
        while (open_color_filled_11) {
            int random11 = rand.nextInt(3) + 1;
            if (random11 == 1) {
                if (redcounter <= 3) {
                    HB11.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_11 = false;
                } else {
                    continue;
                }
            }
            if (random11 == 2) {
                if (bluecounter <= 3) {
                    HB11.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_11 = false;
                } else {
                    continue;
                }
            }
            if (random11 == 3) {
                if (greencounter <= 3) {
                    HB11.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_11 = false;
                } else {
                    continue;
                }
            }
        }
        HB12 = (Button) findViewById(R.id.HB1_2);
        boolean open_color_filled_12 = true;
        while (open_color_filled_12) {
            int random12 = rand.nextInt(3) + 1;
            if (random12 == 1) {
                if (redcounter <= 3) {
                    HB12.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_12 = false;
                } else {
                    continue;
                }
            }
            if (random12 == 2) {
                if (bluecounter <= 3) {
                    HB12.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_12 = false;
                } else {
                    continue;
                }
            }
            if (random12 == 3) {
                if (greencounter <= 3) {
                    HB12.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_12 = false;
                } else {
                    continue;
                }
            }
        }
        HB13 = (Button) findViewById(R.id.HB1_3);
        boolean open_color_filled_13 = true;
        while (open_color_filled_13) {
            int random13 = rand.nextInt(3) + 1;
            if (random13 == 1) {
                if (redcounter <= 3) {
                    HB13.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_13 = false;
                } else {
                    continue;
                }
            }
            if (random13 == 2) {
                if (bluecounter <= 3) {
                    HB13.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_13 = false;
                } else {
                    continue;
                }
            }
            if (random13 == 3) {
                if (greencounter <= 3) {
                    HB13.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_13 = false;
                } else {
                    continue;
                }
            }
        }
        HB14 = (Button) findViewById(R.id.HB1_4);
        HB14.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        HB21 = (Button) findViewById(R.id.HB2_1);
        boolean open_color_filled_21 = true;
        while (open_color_filled_21) {
            int random21 = rand.nextInt(3) + 1;
            if (random21 == 1) {
                if (redcounter <= 3) {
                    HB21.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_21 = false;
                } else {
                    continue;
                }
            }
            if (random21 == 2) {
                if (bluecounter <= 3) {
                    HB21.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_21 = false;
                } else {
                    continue;
                }
            }
            if (random21 == 3) {
                if (greencounter <= 3) {
                    HB21.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_21 = false;
                } else {
                    continue;
                }
            }
        }
        HB22 = (Button) findViewById(R.id.HB2_2);
        boolean open_color_filled_22 = true;
        while (open_color_filled_22) {
            int random22 = rand.nextInt(3) + 1;
            if (random22 == 1) {
                if (redcounter <= 3) {
                    HB22.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_22 = false;
                } else {
                    continue;
                }
            }
            if (random22 == 2) {
                if (bluecounter <= 3) {
                    HB22.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_22 = false;
                } else {
                    continue;
                }
            }
            if (random22 == 3) {
                if (greencounter <= 3) {
                    HB22.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_22 = false;
                } else {
                    continue;
                }
            }
        }
        HB23 = (Button) findViewById(R.id.HB2_3);
        boolean open_color_filled_23 = true;
        while (open_color_filled_23) {
            int random23 = rand.nextInt(3) + 1;
            if (random23 == 1) {
                if (redcounter <= 3) {
                    HB23.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_23 = false;
                } else {
                    continue;
                }
            }
            if (random23 == 2) {
                if (bluecounter <= 3) {
                    HB23.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_23 = false;
                } else {
                    continue;
                }
            }
            if (random23 == 3) {
                if (greencounter <= 3) {
                    HB23.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_23 = false;
                } else {
                    continue;
                }
            }
        }

        HB24 = (Button) findViewById(R.id.HB2_4);
        HB24.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        HB31 = (Button) findViewById(R.id.HB3_1);
        boolean open_color_filled_31 = true;
        while (open_color_filled_31) {
            int random31 = rand.nextInt(3) + 1;
            if (random31 == 1) {
                if (redcounter <= 3) {
                    HB31.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_31 = false;
                } else {
                    continue;
                }
            }
            if (random31 == 2) {
                if (bluecounter <= 3) {
                    HB31.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_31 = false;
                } else {
                    continue;
                }
            }
            if (random31 == 3) {
                if (greencounter <= 3) {
                    HB31.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_31 = false;
                } else {
                    continue;
                }
            }
        }

        HB32 = (Button) findViewById(R.id.HB3_2);
        boolean open_color_filled_32 = true;
        while (open_color_filled_32) {
            int random32 = rand.nextInt(3) + 1;
            if (random32 == 1) {
                if (redcounter <= 3) {
                    HB32.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_32 = false;
                } else {
                    continue;
                }
            }
            if (random32 == 2) {
                if (bluecounter <= 3) {
                    HB32.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_32 = false;
                } else {
                    continue;
                }
            }
            if (random32 == 3) {
                if (greencounter <= 3) {
                    HB32.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_32 = false;
                } else {
                    continue;
                }
            }
        }
        HB33 = (Button) findViewById(R.id.HB3_3);
        boolean open_color_filled_33 = true;
        while (open_color_filled_33) {
            int random33 = rand.nextInt(3) + 1;
            if (random33 == 1) {
                if (redcounter <= 3) {
                    HB33.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_33 = false;
                } else {
                    continue;
                }
            }
            if (random33 == 2) {
                if (bluecounter <= 3) {
                    HB33.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_33 = false;
                } else {
                    continue;
                }
            }
            if (random33 == 3) {
                if (greencounter <= 3) {
                    HB33.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_33 = false;
                } else {
                    continue;
                }
            }
        }
        HB34 = (Button) findViewById(R.id.HB3_4);
        HB34.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        HB41 = (Button) findViewById(R.id.HB4_1);
        boolean open_color_filled_41 = true;
        while (open_color_filled_41) {
            int random41 = rand.nextInt(3) + 1;
            if (random41 == 1) {
                if (redcounter <= 3) {
                    HB41.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_41 = false;
                } else {
                    continue;
                }
            }
            if (random41 == 2) {
                if (bluecounter <= 3) {
                    HB41.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_41 = false;
                } else {
                    continue;
                }
            }
            if (random41 == 3) {
                if (greencounter <= 3) {
                    HB41.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_41 = false;
                } else {
                    continue;
                }
            }
        }
        HB42 = (Button) findViewById(R.id.HB4_2);
        boolean open_color_filled_42 = true;
        while (open_color_filled_42) {
            int random42 = rand.nextInt(3) + 1;
            if (random42 == 1) {
                if (redcounter <= 3) {
                    HB42.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_42 = false;
                } else {
                    continue;
                }
            }
            if (random42 == 2) {
                if (bluecounter <= 3) {
                    HB42.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_42 = false;
                } else {
                    continue;
                }
            }
            if (random42 == 3) {
                if (greencounter <= 3) {
                    HB42.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_42 = false;
                } else {
                    continue;
                }
            }
        }

        HB43 = (Button) findViewById(R.id.HB4_3);
        boolean open_color_filled_43 = true;
        while (open_color_filled_43) {
            int random43 = rand.nextInt(3) + 1;
            if (random43 == 1) {
                if (redcounter <= 3) {
                    HB43.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_43 = false;
                } else {
                    continue;
                }
            }
            if (random43 == 2) {
                if (bluecounter <= 3) {
                    HB43.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_43 = false;
                } else {
                    continue;
                }
            }
            if (random43 == 3) {
                if (greencounter <= 3) {
                    HB43.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_43 = false;
                } else {
                    continue;
                }
            }
        }
        HB44 = (Button) findViewById(R.id.HB4_4);
        HB44.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        colu1[0] = HB11;
        colu1[1] = HB21;
        colu1[2] = HB31;
        colu1[3] = HB41;

        colu2[0] = HB12;
        colu2[1] = HB22;
        colu2[2] = HB32;
        colu2[3] = HB42;

        colu3[0] = HB13;
        colu3[1] = HB23;
        colu3[2] = HB33;
        colu3[3] = HB43;

        colu4[0] = HB14;
        colu4[1] = HB24;
        colu4[2] = HB34;
        colu4[3] = HB44;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void HmoveButtonPosition1(View view) {
        int i;
        int j;
        if (putting_down == false) {
            for (i = 0; i < colu1.length; i++) {
                if (colu1[i].getId() == view.getId()) {
                    if (colu1[i].getBackgroundTintList() != ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu1[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IHB11.setVisibility(View.VISIBLE);
                            IHB11.setBackgroundTintList(colu1[i].getBackgroundTintList());
                            topRowColor = IHB11.getBackgroundTintList();
                            colu1[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if (putting_down) {
            for (j = 0; j < colu1.length; j++) {
                if (colu1[j].getId() == view.getId()) {
                    if (colu1[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu1[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu1[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu2.length; j++) {
                if (colu2[j].getId() == view.getId()) {
                    if (colu2[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu3.length; j++) {
                if (colu3[j].getId() == view.getId()) {
                    if (colu3[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu4.length; j++) {
                if (colu4[j].getId() == view.getId()) {
                    if (colu4[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
        }
        int matchcounter1=0;
        int matchcounter2=0;
        int matchcounter3=0;
        int matchcounter4=0;
        int c1;
        int c2;
        int c3;
        int c4;
        for(c1=0;c1<colu1.length-1;c1++){
            if(colu1[c1].getBackgroundTintList()==colu1[c1+1].getBackgroundTintList() && c1!=3){
                matchcounter1++;
            }
        }
        for(c2=0;c2<colu2.length-1;c2++){
            if(colu2[c2].getBackgroundTintList()==colu2[c2+1].getBackgroundTintList() && c2!=3){
                matchcounter2++;
            }
        }
        for(c3=0;c3<colu1.length-1;c3++){
            if(colu3[c3].getBackgroundTintList()==colu3[c3+1].getBackgroundTintList() && c3!=3){
                matchcounter3++;
            }
        }
        for(c4=0;c4<colu4.length-1;c4++){
            if(colu4[c4].getBackgroundTintList()==colu4[c4+1].getBackgroundTintList() && c4!=3){
                matchcounter4++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && putting_down==false){
            GameWin();
        }
    }

    public void HmoveButtonPosition2(View view){
        int i;
        int j;
        if (putting_down == false) {
            for (i = 0; i < colu2.length; i++) {
                if (colu2[i].getId() == view.getId()) {
                    if (colu2[i].getBackgroundTintList() != ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu2[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IHB12.setVisibility(View.VISIBLE);
                            IHB12.setBackgroundTintList(colu2[i].getBackgroundTintList());
                            topRowColor = IHB12.getBackgroundTintList();
                            colu2[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for (j = 0; j < colu2.length; j++) {
                if (colu2[j].getId() == view.getId()) {
                    if (colu2[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu1.length; j++){
                if(colu1[j].getId() == view.getId()){
                    if(colu1[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu1[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu1[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu3.length; j++) {
                if (colu3[j].getId() == view.getId()) {
                    if (colu3[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu4.length; j++) {
                if (colu4[j].getId() == view.getId()) {
                    if (colu4[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
        }
        int matchcounter1=0;
        int matchcounter2=0;
        int matchcounter3=0;
        int matchcounter4=0;
        int c1;
        int c2;
        int c3;
        int c4;
        for(c1=0;c1<colu1.length-1;c1++){
            if(colu1[c1].getBackgroundTintList()==colu1[c1+1].getBackgroundTintList() && c1!=3){
                matchcounter1++;
            }
        }
        for(c2=0;c2<colu2.length-1;c2++){
            if(colu2[c2].getBackgroundTintList()==colu2[c2+1].getBackgroundTintList() && c2!=3){
                matchcounter2++;
            }
        }
        for(c3=0;c3<colu1.length-1;c3++){
            if(colu3[c3].getBackgroundTintList()==colu3[c3+1].getBackgroundTintList() && c3!=3){
                matchcounter3++;
            }
        }
        for(c4=0;c4<colu4.length-1;c4++){
            if(colu4[c4].getBackgroundTintList()==colu4[c4+1].getBackgroundTintList() && c4!=3){
                matchcounter4++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && putting_down==false){
            GameWin();
        }
    }
    public void HmoveButtonPosition3(View view){
        int i;
        int j;
        if (putting_down == false) {
            for (i = 0; i < colu3.length; i++) {
                if (colu3[i].getId() == view.getId()) {
                    if (colu3[i].getBackgroundTintList() != ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu3[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IHB13.setVisibility(View.VISIBLE);
                            IHB13.setBackgroundTintList(colu3[i].getBackgroundTintList());
                            topRowColor = IHB13.getBackgroundTintList();
                            colu3[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for (j = 0; j < colu3.length; j++) {
                if (colu3[j].getId() == view.getId()) {
                    if (colu3[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu1.length; j++){
                if(colu1[j].getId() == view.getId()){
                    if(colu1[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu1[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu1[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu2.length; j++) {
                if (colu2[j].getId() == view.getId()) {
                    if (colu2[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu4.length; j++) {
                if (colu4[j].getId() == view.getId()) {
                    if (colu4[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
        }
        int matchcounter1=0;
        int matchcounter2=0;
        int matchcounter3=0;
        int matchcounter4=0;
        int c1;
        int c2;
        int c3;
        int c4;
        for(c1=0;c1<colu1.length-1;c1++){
            if(colu1[c1].getBackgroundTintList()==colu1[c1+1].getBackgroundTintList() && c1!=3){
                matchcounter1++;
            }
        }
        for(c2=0;c2<colu2.length-1;c2++){
            if(colu2[c2].getBackgroundTintList()==colu2[c2+1].getBackgroundTintList() && c2!=3){
                matchcounter2++;
            }
        }
        for(c3=0;c3<colu1.length-1;c3++){
            if(colu3[c3].getBackgroundTintList()==colu3[c3+1].getBackgroundTintList() && c3!=3){
                matchcounter3++;
            }
        }
        for(c4=0;c4<colu4.length-1;c4++){
            if(colu4[c4].getBackgroundTintList()==colu4[c4+1].getBackgroundTintList() && c4!=3){
                matchcounter4++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && putting_down==false){
            GameWin();
        }
    }
    public void HmoveButtonPosition4(View view){
        int i;
        int j;
        if (putting_down == false) {
            for (i = 0; i < colu4.length; i++) {
                if (colu4[i].getId() == view.getId()) {
                    if (colu4[i].getBackgroundTintList() != ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu4[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IHB14.setVisibility(View.VISIBLE);
                            IHB14.setBackgroundTintList(colu4[i].getBackgroundTintList());
                            topRowColor = IHB14.getBackgroundTintList();
                            colu4[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for (j = 0; j < colu3.length; j++) {
                if (colu3[j].getId() == view.getId()) {
                    if (colu3[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu1.length; j++){
                if(colu1[j].getId() == view.getId()){
                    if(colu1[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu1[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu1[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu2.length; j++) {
                if (colu2[j].getId() == view.getId()) {
                    if (colu2[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for (j = 0; j < colu4.length; j++) {
                if (colu4[j].getId() == view.getId()) {
                    if (colu4[j].getBackgroundTintList() == ColorStateList.valueOf(Color.YELLOW)) {
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IHB11.setVisibility(View.INVISIBLE);
                            IHB12.setVisibility(View.INVISIBLE);
                            IHB13.setVisibility(View.INVISIBLE);
                            IHB14.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
        }
        int matchcounter1=0;
        int matchcounter2=0;
        int matchcounter3=0;
        int matchcounter4=0;
        int c1;
        int c2;
        int c3;
        int c4;
        for(c1=0;c1<colu1.length-1;c1++){
            if(colu1[c1].getBackgroundTintList()==colu1[c1+1].getBackgroundTintList() && c1!=3){
                matchcounter1++;
            }
        }
        for(c2=0;c2<colu2.length-1;c2++){
            if(colu2[c2].getBackgroundTintList()==colu2[c2+1].getBackgroundTintList() && c2!=3){
                matchcounter2++;
            }
        }
        for(c3=0;c3<colu1.length-1;c3++){
            if(colu3[c3].getBackgroundTintList()==colu3[c3+1].getBackgroundTintList() && c3!=3){
                matchcounter3++;
            }
        }
        for(c4=0;c4<colu4.length-1;c4++){
            if(colu4[c4].getBackgroundTintList()==colu4[c4+1].getBackgroundTintList() && c4!=3){
                matchcounter4++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && putting_down==false){
            GameWin();
        }
    }
    protected void GameWin(){
        AlertDialog.Builder H_WinningDialog = new AlertDialog.Builder(this);
        H_WinningDialog.setTitle("Done!")
                .setMessage("You Won! Would you like to keep playing?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface h_dialog, int h) {
                        Intent hard_intent = getIntent();
                        finish();
                        startActivity(hard_intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface hard_dialog, int h) {
                finish();
            }
                });
        AlertDialog dialog = H_WinningDialog.create();
        dialog.show();
    }
}