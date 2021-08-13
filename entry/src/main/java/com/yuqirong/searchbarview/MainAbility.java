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

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import com.yuqirong.searchbarview.slice.MainAbilitySlice;

/**
 * MainAbility class.
 */
public class MainAbility extends Ability {

    /**
     * onStart.
     */
    @Override
    public void onStart(final Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
    }
}
