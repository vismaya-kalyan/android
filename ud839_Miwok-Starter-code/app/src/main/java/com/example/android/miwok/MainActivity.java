/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_category);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        // Numbers TextView
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//
//        // Set a click listener on that View
//        numbers.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numbersIntent);
//            }
//        });
//
//        // Family TextView
//        TextView family = (TextView) findViewById(R.id.family);
//
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActiviy.class);
//                startActivity(familyIntent);
//            }
//        });
//
//        // Colors TextView
//        TextView colors = (TextView) findViewById( R.id.colors);
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                Intent colorIntent = new Intent(MainActivity.this , ColorsActivity.class);
//                startActivity(colorIntent);
//            }
//        });
//
//        //Phrases TextView
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//        phrases.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });


    }



}
