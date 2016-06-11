package vn.tale.rxlse;

import org.junit.Test;

import rx.Observable;

/**
 * Author giangnguyen. Created on 6/11/16.
 */
public class RxLseTest {

  @Test
  public void testCreateLse() throws Exception {
    final LoadingSuccessError lse = RxLse.lse(Observable.empty());
  }
}