package com.spx.lithotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;
import com.facebook.litho.widget.Text;
import com.spx.lithotest.feed.FeedActivity;
import com.spx.lithotest.simple.SimpleListActivity;
import com.spx.lithotest.spec.ListItem;
import com.spx.lithotest.spec.ListSection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSimpleList(View view) {
        Intent intent = new Intent(this, SimpleListActivity.class);
        startActivity(intent);
    }

    public void goFeedList(View view) {
        Intent intent = new Intent(this, FeedActivity.class);
        startActivity(intent);
    }
}
