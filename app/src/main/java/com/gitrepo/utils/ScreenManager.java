package com.gitrepo.utils;

import android.content.Context;
import android.content.Intent;

import com.gitrepo.ui.activities.RepoDescriptionActivity;

/**
 * Created by izabela on 1/8/18.
 */

public class ScreenManager {

    public static void goToRepoDescription(Context context) {
        Intent intent = new Intent(context, RepoDescriptionActivity.class);
        context.startActivity(intent);
    }
}
