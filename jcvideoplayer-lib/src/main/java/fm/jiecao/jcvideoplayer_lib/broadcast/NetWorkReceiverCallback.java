package fm.jiecao.jcvideoplayer_lib.broadcast;

/**
 * Created by eme on 2017/9/25.
 */

public interface NetWorkReceiverCallback {
    void onWifi();
    void onMobile();
    void onNotConnected();
}
