package com.liuwei.servicebestpractice;

/**
 * Created by Administrator on 2016/12/21.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
