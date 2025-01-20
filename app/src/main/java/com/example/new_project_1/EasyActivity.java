package com.example.new_project_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.res.ColorStateList;;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
public class EasyActivity extends AppCompatActivity {
    ColorStateList topRowColor;
    Button IEB11,IEB12,IEB13,IEB14,IEB15;
    Button EB11,EB12,EB13,EB14,EB15,EB21,EB22,EB23,EB24,EB25,EB31,EB32,EB33,EB34,EB35,EB41,EB42,EB43,EB44,EB45;
    Button[] colu1=new Button[4];
    Button[] colu2=new Button[4];
    Button[] colu3=new Button[4];
    Button[] colu4=new Button[4];
    Button[] colu5=new Button[4];
    Boolean putting_down=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_easy);
        IEB11=(Button)findViewById(R.id.IEB_11);
        IEB12=(Button)findViewById(R.id.IEB_12);
        IEB13=(Button)findViewById(R.id.IEB_13);
        IEB14=(Button)findViewById(R.id.IEB_14);
        IEB15=(Button)findViewById(R.id.IEB_15);
        IEB11.setVisibility(View.INVISIBLE);
        IEB12.setVisibility(View.INVISIBLE);
        IEB13.setVisibility(View.INVISIBLE);
        IEB14.setVisibility(View.INVISIBLE);
        IEB15.setVisibility(View.INVISIBLE);
        Random rand=new Random();
        int redcounter=0;
        int bluecounter=0;
        int greencounter=0;
        int yellowcounter=0;
        EB11=(Button)findViewById(R.id.EB1_1);
        boolean open_color_filled_11=true;
        while(open_color_filled_11){
            int random11=rand.nextInt(3)+1;
            if(random11==1){
                if(redcounter <=3){
                    EB11.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_11=false;
                }
                else{
                    continue;
                }
            }
            if(random11==2){
                if(bluecounter <=3) {
                    EB11.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_11=false;
                }
                else{
                    continue;
                }
            }
            if(random11==3){
                if(greencounter <=3) {
                    EB11.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_11=false;
                }
                else{
                    continue;
                }
            }
        }
        EB12=(Button)findViewById(R.id.EB1_2);
        boolean open_color_filled_12=true;
        while(open_color_filled_12){
            int random12=rand.nextInt(3)+1;
            if(random12==1){
                if(redcounter <=3){
                    EB12.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_12=false;
                }
                else{
                    continue;
                }
            }
            if(random12==2){
                if(bluecounter <=3) {
                    EB12.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_12=false;
                }
                else{
                    continue;
                }
            }
            if(random12==3){
                if(greencounter <=3) {
                    EB12.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_12=false;
                }
                else{
                    continue;
                }
            }
        }
        EB13=(Button)findViewById(R.id.EB1_3);
        boolean open_color_filled_13=true;
        while(open_color_filled_13){
            int random13=rand.nextInt(3)+1;
            if(random13==1){
                if(redcounter <=3) {
                    EB13.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_13=false;
                }
                else{
                    continue;
                }
            }
            if(random13==2){
                if(bluecounter <=3) {
                    EB13.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_13=false;
                }
                else{
                    continue;
                }
            }
            if(random13==3){
                if(greencounter <=3) {
                    EB13.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_13=false;
                }
                else{
                    continue;
                }
            }
        }
        EB14=(Button)findViewById(R.id.EB1_4);
        EB14.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB15=(Button)findViewById(R.id.EB1_5);
        EB15.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB21=(Button)findViewById(R.id.EB2_1);
        boolean open_color_filled_21=true;
        while(open_color_filled_21){
            int random21=rand.nextInt(3)+1;
            if(random21==1){
                if(redcounter <=3) {
                    EB21.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_21=false;
                }
                else{
                    continue;
                }
            }
            if(random21==2){
                if(bluecounter <=3) {
                    EB21.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_21=false;
                }
                else{
                    continue;
                }
            }
            if(random21==3){
                if(greencounter <=3) {
                    EB21.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_21=false;
                }
                else{
                    continue;
                }
            }
        }

        EB22=(Button)findViewById(R.id.EB2_2);
        boolean open_color_filled_22=true;
        while(open_color_filled_22){
            int random22=rand.nextInt(3)+1;
            if(random22==1){
                if(redcounter <=3) {
                    EB22.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_22=false;
                }
                else{
                    continue;
                }
            }
            if(random22==2){
                if(bluecounter <=3) {
                    EB22.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_22=false;
                }
                else{
                    continue;
                }
            }
            if(random22==3){
                if(greencounter <=3) {
                    EB22.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_22=false;
                }
                else{
                    continue;
                }
            }
        }
        EB23=(Button)findViewById(R.id.EB2_3);
        boolean open_color_filled_23=true;
        while(open_color_filled_23){
            int random23=rand.nextInt(3)+1;
            if(random23==1){
                if(redcounter <=3) {
                    EB23.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_23=false;
                }
                else{
                    continue;
                }
            }
            if(random23==2){
                if(bluecounter <=3) {
                    EB23.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_23=false;
                }
                else{
                    continue;
                }
            }
            if(random23==3){
                if(greencounter <=3) {
                    EB23.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_23=false;
                }
                else{
                    continue;
                }
            }
        }

        EB24=(Button)findViewById(R.id.EB2_4);
        EB24.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB25=(Button)findViewById(R.id.EB2_5);
        EB25.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB31=(Button)findViewById(R.id.EB3_1);
        boolean open_color_filled_31=true;
        while(open_color_filled_31){
            int random31=rand.nextInt(3)+1;
            if(random31==1){
                if(redcounter <=3) {
                    EB31.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_31=false;
                }
                else{
                    continue;
                }
            }
            if(random31==2){
                if(bluecounter <=3) {
                    EB31.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_31=false;
                }
                else{
                    continue;
                }
            }
            if(random31==3){
                if(greencounter <=3) {
                    EB31.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_31=false;
                }
                else{
                    continue;
                }
            }
        }

        EB32=(Button)findViewById(R.id.EB3_2);
        boolean open_color_filled_32=true;
        while(open_color_filled_32){
            int random32=rand.nextInt(3)+1;
            if(random32==1){
                if(redcounter <=3) {
                    EB32.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_32=false;
                }
                else{
                    continue;
                }
            }
            if(random32==2){
                if(bluecounter <=3) {
                    EB32.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_32=false;
                }
                else{
                    continue;
                }
            }
            if(random32==3){
                if(greencounter <=3) {
                    EB32.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_32=false;
                }
                else{
                    continue;
                }
            }
        }
        EB33=(Button)findViewById(R.id.EB3_3);
        boolean open_color_filled_33=true;
        while(open_color_filled_33){
            int random33 =rand.nextInt(3)+1;
            if(random33==1){
                if(redcounter <=3) {
                    EB33.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_33=false;
                }
                else{
                    continue;
                }
            }
            if(random33==2){
                if(bluecounter <=3) {
                    EB33.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_33=false;
                }
                else{
                    continue;
                }
            }
            if(random33==3){
                if(greencounter <=3) {
                    EB33.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_33=false;
                }
                else{
                    continue;
                }
            }
        }

        EB34=(Button)findViewById(R.id.EB3_4);
        EB34.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB35=(Button)findViewById(R.id.EB3_5);
        EB35.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB41=(Button)findViewById(R.id.EB4_1);
        boolean open_color_filled_41=true;
        while(open_color_filled_41){
            int random41 =rand.nextInt(3)+1;
            if(random41==1){
                if(redcounter <=3) {
                    EB41.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_41=false;
                }
                else{
                    continue;
                }
            }
            if(random41==2){
                if(bluecounter <=3) {
                    EB41.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_41=false;
                }
                else{
                    continue;
                }
            }
            if(random41==3){
                if(greencounter <=3) {
                    EB41.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_41=false;
                }
                else{
                    continue;
                }
            }
        }

        EB42=(Button)findViewById(R.id.EB4_2);
        boolean open_color_filled_42=true;
        while(open_color_filled_42){
            int random42=rand.nextInt(4)+1;
            if(random42==1){
                if(redcounter <=3) {
                    EB42.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_42=false;
                }
                else{
                    continue;
                }
            }
            if(random42==2){
                if(bluecounter <=3) {
                    EB42.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_42=false;
                }
                else{
                    continue;
                }
            }
            if(random42==3){
                if(greencounter <=3) {
                    EB42.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_42=false;
                }
                else{
                    continue;
                }
            }
        }

        EB43=(Button)findViewById(R.id.EB4_3);
        boolean open_color_filled_43=true;
        while(open_color_filled_43){
            int random43=rand.nextInt(4)+1;
            if(random43==1){
                if(redcounter <=3) {
                    EB43.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                    redcounter++;
                    open_color_filled_43=false;
                }
                else{
                    continue;
                }
            }
            if(random43==2){
                if(bluecounter <=3) {
                    EB43.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                    bluecounter++;
                    open_color_filled_43=false;
                }
                else{
                    continue;
                }
            }
            if(random43==3){
                if(greencounter <=3) {
                    EB43.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                    greencounter++;
                    open_color_filled_43=false;
                }
                else{
                    continue;
                }
            }
        }

        EB44=(Button)findViewById(R.id.EB4_4);
        EB44.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        EB45=(Button)findViewById(R.id.EB4_5);
        EB45.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));

        colu1[0]=EB11;
        colu1[1]=EB21;
        colu1[2]=EB31;
        colu1[3]=EB41;

        colu2[0]=EB12;
        colu2[1]=EB22;
        colu2[2]=EB32;
        colu2[3]=EB42;

        colu3[0]=EB13;
        colu3[1]=EB23;
        colu3[2]=EB33;
        colu3[3]=EB43;

        colu4[0]=EB14;
        colu4[1]=EB24;
        colu4[2]=EB34;
        colu4[3]=EB44;

        colu5[0]=EB15;
        colu5[1]=EB25;
        colu5[2]=EB35;
        colu5[3]=EB45;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void moveButtonPosition1(View view){
        int i;
        int j;
        if(putting_down==false) {
            for (i = 0; i < colu1.length; i++) {
                if (colu1[i].getId() == view.getId()) {
                    if(colu1[i].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu1[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IEB11.setVisibility(View.VISIBLE);
                            IEB11.setBackgroundTintList(colu1[i].getBackgroundTintList());
                            topRowColor = IEB11.getBackgroundTintList();
                            colu1[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for(j=0;j<colu1.length; j++){
                if(colu1[j].getId() == view.getId()){
                    if(colu1[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu1[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu1[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu2.length; j++){
                if(colu2[j].getId() == view.getId()){
                    if(colu2[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu3.length; j++){
                if(colu3[j].getId() == view.getId()){
                    if(colu3[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu4.length; j++){
                if(colu4[j].getId() == view.getId()){
                    if(colu4[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu5.length; j++){
                if(colu5[j].getId() == view.getId()){
                    if(colu5[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu5[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu5[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
        int matchcounter5=0;
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
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
        for(c5=0;c5<colu1.length-1;c5++){
            if(colu1[c5].getBackgroundTintList()==colu1[c5+1].getBackgroundTintList() && c5!=3){
                matchcounter5++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && matchcounter5==3 && putting_down==false){
            GameWin();
        }
    }

    public void moveButtonPosition2(View view){
        int i;
        int j;
        if(putting_down==false) {
            for (i = 0; i < colu2.length; i++) {
                if (colu2[i].getId() == view.getId()) {
                    if(colu2[i].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu2[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IEB12.setVisibility(View.VISIBLE);
                            IEB12.setBackgroundTintList(colu2[i].getBackgroundTintList());
                            topRowColor = IEB12.getBackgroundTintList();
                            colu2[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for(j=0;j<colu2.length; j++){
                if(colu2[j].getId() == view.getId()){
                    if(colu2[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu3.length; j++){
                if(colu3[j].getId() == view.getId()){
                    if(colu3[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu4.length; j++){
                if(colu4[j].getId() == view.getId()){
                    if(colu4[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu5.length; j++){
                if(colu5[j].getId() == view.getId()){
                    if(colu5[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu5[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu5[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
        int matchcounter5=0;
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
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
        for(c5=0;c5<colu1.length-1;c5++){
            if(colu1[c5].getBackgroundTintList()==colu1[c5+1].getBackgroundTintList() && c5!=3){
                matchcounter5++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && matchcounter5==3 && putting_down==false){
            GameWin();
        }
    }

    public void moveButtonPosition3(View view){
        int i;
        int j;
        if(putting_down==false) {
            for (i = 0; i < colu3.length; i++) {
                if (colu3[i].getId() == view.getId()) {
                    if(colu3[i].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu3[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IEB13.setVisibility(View.VISIBLE);
                            IEB13.setBackgroundTintList(colu3[i].getBackgroundTintList());
                            topRowColor = IEB13.getBackgroundTintList();
                            colu3[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for(j=0;j<colu3.length; j++){
                if(colu3[j].getId() == view.getId()){
                    if(colu3[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu2.length; j++){
                if(colu2[j].getId() == view.getId()){
                    if(colu2[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu4.length; j++){
                if(colu4[j].getId() == view.getId()){
                    if(colu4[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu5.length; j++){
                if(colu5[j].getId() == view.getId()){
                    if(colu5[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu5[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu5[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
        int matchcounter5=0;
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
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
        for(c5=0;c5<colu1.length-1;c5++){
            if(colu1[c5].getBackgroundTintList()==colu1[c5+1].getBackgroundTintList() && c5!=3){
                matchcounter5++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && matchcounter5==3 && putting_down==false){
            GameWin();
        }
    }

    public void moveButtonPosition4(View view){
        int i;
        int j;
        if(putting_down==false) {
            for (i = 0; i < colu4.length; i++) {
                if (colu4[i].getId() == view.getId()) {
                    if(colu4[i].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu4[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IEB14.setVisibility(View.VISIBLE);
                            IEB14.setBackgroundTintList(colu4[i].getBackgroundTintList());
                            topRowColor = IEB14.getBackgroundTintList();
                            colu4[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for(j=0;j<colu4.length; j++){
                if(colu4[j].getId() == view.getId()){
                    if(colu4[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu2.length; j++){
                if(colu2[j].getId() == view.getId()){
                    if(colu2[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu3.length; j++){
                if(colu3[j].getId() == view.getId()){
                    if(colu3[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu5.length; j++){
                if(colu5[j].getId() == view.getId()){
                    if(colu5[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu5[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu5[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
        int matchcounter5=0;
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
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
        for(c5=0;c5<colu1.length-1;c5++){
            if(colu1[c5].getBackgroundTintList()==colu1[c5+1].getBackgroundTintList() && c5!=3){
                matchcounter5++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && matchcounter5==3 && putting_down==false){
            GameWin();
        }
    }

    public void moveButtonPosition5(View view){
        int i;
        int j;
        if(putting_down==false) {
            for (i = 0; i < colu5.length; i++) {
                if (colu5[i].getId() == view.getId()) {
                    if(colu5[i].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                        if(i==0 || colu5[i-1].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)) {
                            IEB15.setVisibility(View.VISIBLE);
                            IEB15.setBackgroundTintList(colu5[i].getBackgroundTintList());
                            topRowColor = IEB15.getBackgroundTintList();
                            colu5[i].setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                            putting_down = true;
                        }
                    }
                }
            }
        }
        else if(putting_down){
            for(j=0;j<colu5.length; j++){
                if(colu5[j].getId() == view.getId()){
                    if(colu5[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu5[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu5[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu2.length; j++){
                if(colu2[j].getId() == view.getId()){
                    if(colu2[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu2[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu2[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu3.length; j++){
                if(colu3[j].getId() == view.getId()){
                    if(colu3[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu3[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu3[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
                            putting_down = false;
                        }
                    }
                }
            }
            for(j=0;j<colu4.length; j++){
                if(colu4[j].getId() == view.getId()){
                    if(colu4[j].getBackgroundTintList()==ColorStateList.valueOf(Color.YELLOW)){
                        if(j==3 || colu4[j+1].getBackgroundTintList()!=ColorStateList.valueOf(Color.YELLOW)) {
                            colu4[j].setBackgroundTintList(topRowColor);
                            IEB11.setVisibility(View.INVISIBLE);
                            IEB12.setVisibility(View.INVISIBLE);
                            IEB13.setVisibility(View.INVISIBLE);
                            IEB14.setVisibility(View.INVISIBLE);
                            IEB15.setVisibility(View.INVISIBLE);
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
        int matchcounter5=0;
        int c1;
        int c2;
        int c3;
        int c4;
        int c5;
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
        for(c5=0;c5<colu1.length-1;c5++){
            if(colu1[c5].getBackgroundTintList()==colu1[c5+1].getBackgroundTintList() && c5!=3){
                matchcounter5++;
            }
        }
        if(matchcounter1==3 && matchcounter2==3 && matchcounter3==3 && matchcounter4==3 && matchcounter5==3 && putting_down==false){
            GameWin();
        }
    }

    protected void GameWin(){
        AlertDialog.Builder E_WinningDialog = new AlertDialog.Builder(this);
        E_WinningDialog.setTitle("Done!")
                .setMessage("You Won! Would you like to keep playing?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface e_dialog, int e) {
                        Intent easy_intent = getIntent();
                        finish();
                        startActivity(easy_intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface easy_dialog, int e) {
                        finish();
                    }
                });

        AlertDialog dialog = E_WinningDialog.create();
        dialog.show();
    }

}