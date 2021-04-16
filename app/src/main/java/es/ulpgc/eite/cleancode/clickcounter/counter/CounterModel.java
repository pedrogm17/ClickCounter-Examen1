package es.ulpgc.eite.cleancode.clickcounter.counter;

public class CounterModel implements CounterContract.Model {

  public static String TAG = CounterModel.class.getSimpleName();

  private int counter;

  public CounterModel(int counter) {
    this.counter = counter;
  }

  @Override
  public int getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return counter;
  }

  @Override
  public void setCounter(int counter){
    this.counter = counter;
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
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }
}
