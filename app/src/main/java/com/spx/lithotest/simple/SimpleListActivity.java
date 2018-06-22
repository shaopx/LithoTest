package com.spx.lithotest.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;
import com.spx.lithotest.spec.ListSection;

public class SimpleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext context = new ComponentContext(this);

//        final Component component = Text.create(context)
//                .text("Hello World")
//                .textSizeDip(50)
//                .build();
//        final Component component = ListItem.create(context).build();

        final RecyclerCollectionComponent component =
                RecyclerCollectionComponent.create(context)
                        .disablePTR(false)
                        .section(ListSection.create(new SectionContext(context)).build())
                        .build();


        setContentView(LithoView.create(context, component));
    }
}
