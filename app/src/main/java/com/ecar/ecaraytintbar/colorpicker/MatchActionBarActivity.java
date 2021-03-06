/*
 * Copyright (C) 2013 readyState Software Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ecar.ecaraytintbar.colorpicker;

import android.app.Activity;
import android.os.Bundle;

import com.ecar.tintbar.SystemBarTintManager;
import com.ecar.tintbar.TintHelper;
import com.readystatesoftware.systembartint.sample.R;

public class MatchActionBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TintHelper.initStatusBar(this, R.color.red);
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setNavigationBarTintColor(R.color.actionbar_bg);
        tintManager.setStatusBarAlpha(0.2f);

        setContentView(R.layout.activity_match_actionbar);

    }


}
