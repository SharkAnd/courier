package dell.courier.courier;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CourierViewPager extends ViewPager{

    public CourierViewPager(@NonNull Context context) {
        super(context);
    }

    public CourierViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        //return super.onInterceptTouchEvent(ev);
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        //return super.onTouchEvent(ev);
        return false;
    }
}
