package es.ulpgc.eite.cleancode.clickcounter.clicks;

public class ClicksModel implements ClicksContract.Model {

  public static String TAG = ClicksModel.class.getSimpleName();

  private int data;

  public ClicksModel(int data) {
    this.data = data;
  }

  @Override
  public int getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(int data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromNextScreen(int data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(int data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }
}
