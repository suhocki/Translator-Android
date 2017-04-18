package llltt.yandextest.ui.favorites;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import llltt.yandextest.R;
import llltt.yandextest.ui.base.MoxyController;

/**
 * Created by Maksim Sukhotski on 4/17/2017.
 */

public class FavoritesController extends MoxyController implements FavoritesView {
    public static final String TAB_NAME = "Избранное";

    @Override
    protected View inflateView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.part_recycler, container, false);
    }
}
