package rxlll.yandextest.ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rxlll.yandextest.R;
import rxlll.yandextest.ui.base.MoxyController;

/**
 * Created by Maksim Sukhotski on 4/17/2017.
 */

public class SettingsController extends MoxyController implements SettingsView {
    @Override
    protected View inflateView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.controller_settings, container, false);
    }

    @Override
    protected void onViewBound(View view) {

    }
}
