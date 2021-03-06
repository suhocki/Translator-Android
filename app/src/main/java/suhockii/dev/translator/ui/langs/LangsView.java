package suhockii.dev.translator.ui.langs;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

import java.util.List;

import suhockii.dev.translator.data.repositories.database.Lang;

/**
 * Created by Maksim Sukhotski on 4/21/2017.
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface LangsView extends MvpView {
    void showTitleText(boolean type);

    void showSwitch(boolean b);

    void showLangs(List<Lang> langs);

    @StateStrategyType(SkipStrategy.class)
    void showMessage(String s);

    @StateStrategyType(SkipStrategy.class)
    void popController();
}
