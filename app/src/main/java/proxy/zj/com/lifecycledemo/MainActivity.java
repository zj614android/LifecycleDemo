package proxy.zj.com.lifecycledemo;

import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.LifecycleRegistryOwner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LifecycleRegistryOwner {

    private LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proxy.zj.com.lifecycledemo.MyTv mTv = findViewById(R.id.dfttv);
        mTv.setLifecycle(getLifecycle());
        getLifecycle().addObserver(mTv);//1 ***  实际就这一条是原生API
        mTv.setLifeCycleEnable(true);

    }

    @Override
    public LifecycleRegistry getLifecycle() {
        return lifecycleRegistry;
    }
}
