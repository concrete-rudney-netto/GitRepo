package com.gitrepo.util;

import android.content.Context;
import android.content.Intent;

import com.gitrepo.ui.activities.RepoPullActivity;

/**
 * Created by izabela on 12/4/17.
 */

public class ScreenManager {

    public static void goToRepoDescription(Context context) {
        Intent intent = new Intent(context, RepoPullActivity.class);
        context.startActivity(intent);
    }
}
