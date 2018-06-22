package com.spx.lithotest.feed.spec;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Progress;
import com.facebook.yoga.YogaAlign;

/**
 * Created by Srijith on 28-01-2018.
 */

@LayoutSpec
public class ProgressLayoutSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c) {
        return Column.create(c)
                .child(
                        Progress.create(c)
                                .widthDip(40)
                                .heightDip(40)
                                .alignSelf(YogaAlign.CENTER)
                                .build()
                )
                .build();
    }

}