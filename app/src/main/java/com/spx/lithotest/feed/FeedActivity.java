package com.spx.lithotest.feed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;
import com.spx.lithotest.feed.spec.ListSection;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext c = new ComponentContext(this);
        final Component component = RecyclerCollectionComponent.create(c)
                .section(ListSection.create(new SectionContext(c)).build())
                .build();

        final LithoView lithoView = LithoView.create(c, component);

        setContentView(lithoView);

    }
}