package proxy.zj.com.lifecycledemo;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class MyTv extends TextView implements LifecycleObserver {
    private String TAG = "MyTv";
    private boolean lifeCycleEnable;
    private Lifecycle lifecycle;

    public boolean isLifeCycleEnable() {
        return lifeCycleEnable;
    }

    public void setLifeCycleEnable(boolean lifeCycleEnable) {
        this.lifeCycleEnable = lifeCycleEnable;
    }

    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public MyTv(Context context) {
        super(context);

    }

    public MyTv(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public MyTv(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    // ****************** lifeCycle ******************

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void create() {
        if (lifeCycleEnable) {
            String text = System.currentTimeMillis() + "-creat\n";
            Log.e(TAG, text);
            this.setText(text);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start() {
        if (lifeCycleEnable) {
            String text = System.currentTimeMillis() + "-start\n";
            Log.e(TAG, text);
            this.setText(text);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        if (lifeCycleEnable) {
            String text = System.currentTimeMillis() + "-resume\n";
            Log.e(TAG, text);
            this.setText(text);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        if (lifeCycleEnable) {
            String text = System.currentTimeMillis() + "-pause\n";
            Log.e(TAG, text);
            this.setText(text);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
        if (lifeCycleEnable) {
            String text = System.currentTimeMillis() + "-stop\n";
            Log.e(TAG, text);
            this.setText(text);
        }
    }

}
