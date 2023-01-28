package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {

    private final List<int[]> combinationList = new ArrayList<>();

    private int[] boxPositions = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    private int playerTurn = 1;

    private int totalSelectedBoxes = 1;

    private NeumorphCardView playerOneLayout, playerTwoLayout;
    private TextView playerOneName, playerTwoName;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneName = findViewById(R.id.playerOneName);
        playerTwoName = findViewById(R.id.playerTwoName);

        playerOneLayout = findViewById(R.id.playerOneLayout);
        playerTwoLayout = findViewById(R.id.playerTwoLayout);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        combinationList.add(new int[]{0, 1, 2});
        combinationList.add(new int[]{3, 4, 5});
        combinationList.add(new int[]{6, 7, 8});
        combinationList.add(new int[]{0, 3, 6});
        combinationList.add(new int[]{1, 4, 7});
        combinationList.add(new int[]{2, 5, 8});
        combinationList.add(new int[]{2, 4, 6});
        combinationList.add(new int[]{0, 4, 8});

        final String getPlayerOneName = getIntent().getStringExtra("playerOne");
        final String getPlayerTwoName = getIntent().getStringExtra("playerTwo");

        playerOneName.setText(getPlayerOneName);
        playerTwoName.setText(getPlayerTwoName);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(0)) {
                    performAction((ImageView)v, 0);
                }
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(1)) {
                    performAction((ImageView)v, 1);
                }
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(2)) {
                    performAction((ImageView)v, 2);
                }
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(3)) {
                    performAction((ImageView)v, 3);
                }
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(4)) {
                    performAction((ImageView)v, 4);
                }
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(5)) {
                    performAction((ImageView)v, 5);
                }
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(6)) {
                    performAction((ImageView)v, 6);
                }
            }
        });

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(7)) {
                    performAction((ImageView)v, 7);
                }
            }
        });

        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelectable(8)) {
                    performAction((ImageView)v, 8);
                }
            }
        });
    }

    private void performAction(ImageView imageView, int selectedBoxPosition) {
        boxPositions[selectedBoxPosition] = playerTurn;

        if (playerTurn == 1) {
            imageView.setImageResource(R.drawable.tylerrr);
            if (checkPlayerWin()) {
                WinDialog winDialog = new WinDialog(MainActivity.this, "~No Chances~\n" + playerOneName.getText().toString() + " has won the match", MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                winDialog.show();
            }
            else if (totalSelectedBoxes == 9){
                WinDialog winDialog = new WinDialog(MainActivity.this,  "It's a tie! It's a good day", MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                winDialog.show();
            }
            else{
                changePlayerTurn(2);

                totalSelectedBoxes++;
            }
        }
        else{
            imageView.setImageResource(R.drawable.josh);

            if(checkPlayerWin()){
                WinDialog winDialog = new WinDialog(MainActivity.this, "~No Chances~\n" +playerTwoName.getText().toString() + " has won the match", MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                winDialog.show();
            }
            else if(selectedBoxPosition == 9){
                WinDialog winDialog = new WinDialog(MainActivity.this,  "It's a tie! It's a good day", MainActivity.this);
                winDialog.setCancelable(false);
                winDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                winDialog.show();
            }
            else{
                changePlayerTurn(1);

                totalSelectedBoxes++;
            }
        }
    }

    private void changePlayerTurn(int currentPlayerTurn){
        playerTurn = currentPlayerTurn;
        if (playerTurn == 1){
            playerOneLayout.setShadowColorLight(getResources().getColor(R.color.light_pink));
            playerOneLayout.setShadowColorDark(getResources().getColor(R.color.light_pink));
            playerTwoLayout.setShadowColorLight(getResources().getColor(R.color.light_brown));
            playerTwoLayout.setShadowColorDark(getResources().getColor(R.color.brown_shadow));
        }
        else {
            playerTwoLayout.setShadowColorLight(getResources().getColor(R.color.light_pink));
            playerTwoLayout.setShadowColorDark(getResources().getColor(R.color.light_pink));
            playerOneLayout.setShadowColorLight(getResources().getColor(R.color.light_brown));
            playerOneLayout.setShadowColorDark(getResources().getColor(R.color.brown_shadow));
        }
    }

    private boolean checkPlayerWin() {
        boolean response = false;

        for (int i = 0; i < combinationList.size(); i++) {
            final int[] combination = combinationList.get(i);

            if (boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] == playerTurn & boxPositions[combination[2]] == playerTurn) {
                response = true;
            }
        }
        return response;
    }

    private boolean isBoxSelectable(int boxPosition) {
        boolean response = false;

        if (boxPositions[boxPosition] == 0) {
            response = true;
        }
        return response;
    }
    public void restartMatch(){
        boxPositions = new int[]{0,0,0,0,0,0,0,0,0};

        playerTurn = 1;

        totalSelectedBoxes = 1;


         ImageView[] images = new ImageView[]{image1,image2,image3, image4, image5,image6, image7, image8, image9};
         int[] res = new int[]{R.id.image1,R.id.image2,R.id.image3,R.id.image4,R.id.image5,R.id.image6,R.id.image7,R.id.image8,R.id.image9};

         for(int i = 0; i <images.length; i++){
             images[i] = (ImageView)findViewById(res[i]);
             images[i].setImageResource(R.drawable.transparent_back);
         }

    }
}
