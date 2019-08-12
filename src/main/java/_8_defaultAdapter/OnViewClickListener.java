package _8_defaultAdapter;

/**
 * Created by Alvin on 2019-08-12.
 * interface 有肥大問題改動易影響實作端
 */

public interface OnViewClickListener {
    //單擊
    void onClick(int id);
    //長按
    void onLongClick(int id);
    //滑動
    void onSwipe(int id);
    //側滑
    void onSlide();
    //拖拉
    void onDragAndDrop();
    //雙擊
    void onDoubleClick();
}
