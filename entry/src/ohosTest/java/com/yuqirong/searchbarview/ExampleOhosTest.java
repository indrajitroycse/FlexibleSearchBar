/*
2 * Copyright (C) 2020-21 Application Library Enigineering Group
3 *
4 * Licensed under the Apache License, Version 2.0 (the "License");
5 * you may not use this file except in compliance with the License.
6 * You may obtain a copy of the License at
7 *
8 *      http://www.apache.org/licenses/LICENSE-2.0
9 *
10 * Unless required by applicable law or agreed to in writing, software
11 * distributed under the License is distributed on an "AS IS" BASIS,
12 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
13 * See the License for the specific language governing permissions and
14 * limitations under the License.
15 */

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