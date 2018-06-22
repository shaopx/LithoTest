package com.spx.lithotest.spec;

import android.graphics.Color;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;

import static com.facebook.yoga.YogaEdge.ALL;

@LayoutSpec
public class ListItemSpec {

    //    @OnCreateLayout
//    static Component onCreateLayout(ComponentContext c) {
//
//        return Column.create(c)
//                .paddingDip(ALL, 16)
//                .backgroundColor(Color.WHITE)
//                .child(
//                        Text.create(c)
//                                .text("Hello world")
//                                .textSizeSp(40))
//                .child(
//                        Text.create(c)
//                                .text("Litho tutorial")
//                                .textSizeSp(20))
//                .build();
//    }
    @OnCreateLayout
    static Component onCreateLayout(
            ComponentContext c,
            @Prop int color,
            @Prop String title,
            @Prop String subtitle) {

        return Column.create(c)
                .paddingDip(ALL, 16)
                .backgroundColor(color)
                .child(
                        Text.create(c)
                                .text(title)
                                .textSizeSp(40))
                .child(
                        Text.create(c)
                                .text(subtitle)
                                .textSizeSp(20))
                .build();
    }
}