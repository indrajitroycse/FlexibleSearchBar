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
