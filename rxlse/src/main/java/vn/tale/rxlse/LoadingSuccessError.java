package vn.tale.rxlse;

import rx.Observable;

/**
 * Author giangnguyen. Created on 6/11/16.
 */
public interface LoadingSuccessError {

  Observable<Void> loading();
}
