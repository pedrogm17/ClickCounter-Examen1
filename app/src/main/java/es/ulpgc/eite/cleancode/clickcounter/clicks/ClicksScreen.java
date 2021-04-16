package es.ulpgc.eite.cleancode.clickcounter.clicks;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.clickcounter.R;
import es.ulpgc.eite.cleancode.clickcounter.app.AppMediator;

public class ClicksScreen {

  public static void configure(ClicksContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    int data = 0;

    AppMediator mediator = AppMediator.getInstance();

    ClicksContract.Presenter presenter = new ClicksPresenter(mediator);
    ClicksContract.Model model = new ClicksModel(data);
    presenter.injectModel(model);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
