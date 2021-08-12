package com.yuqirong.searchbarview;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;
import ohos.agp.utils.Color;
import ohos.app.Context;

import com.yuqirong.flexiblesearchbarview.SearchBarView;

/**
 * ExampleOhosTest class
 */
public class ExampleOhosTest {
    /**
     * Context
     */
    private final Context context = AbilityDelegatorRegistry.getAbilityDelegator().getAppContext();
    /**
     * Custom View
     */
    private final SearchBarView searchBarView = new SearchBarView(context);

    /**
     * bundle test-case
     */
    @Test
    public void testBundleName() {
        final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("testBundleName","com.yuqirong.searchbarview", actualBundleName);
    }

    /**
     * border color test-case
     */
    @Test
    public void testBorderColor() {
        searchBarView.setBorderColor(Color.BLACK);
        assertEquals("testBorderColor",Color.BLACK,searchBarView.getBorderColor());
    }

    /**
     * border color with Paint test-case
     */
    @Test
    public void testBoderColorPaint() {
        searchBarView.setBorderColorPaint(Color.BLACK);
        assertEquals("testBoderColorPaint",Color.BLACK,searchBarView.getBorderColorPaint());
    }
}