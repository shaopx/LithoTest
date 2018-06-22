package com.spx.lithotest.contacts;


import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Progress;
import com.facebook.yoga.YogaAlign;
import com.spx.lithotest.R;

/**
 * Created by Srijith on 01-05-2017.
 */

@LayoutSpec
public class ProgressBarSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c) {

        return Column.create(c)
                .child(
                        Progress.create(c)
                                .colorAttr(R.attr.colorPrimary)
                                .widthDip(48)
                                .heightDip(48)
                                .alignSelf(YogaAlign.CENTER)
                )
                .build();

    }

}
