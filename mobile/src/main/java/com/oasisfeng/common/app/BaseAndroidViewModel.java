package com.oasisfeng.common.app;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;

public abstract class BaseAndroidViewModel extends AndroidViewModel {

    public BaseAndroidViewModel(Application app) {
        super(app);
    }

    public abstract String getTag();
}
